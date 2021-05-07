#!/usr/bin/python3

import pika
import json

credentials = pika.PlainCredentials('dozer','dozer')
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost',5672,'vhost-dozer',credentials))
channel = connection.channel()

EXCHANGE_NAME = 'TELEMETRY'
X_MAX_PRIORITY = 10

channel.exchange_declare(exchange=EXCHANGE_NAME, exchange_type='headers')

#remove exclusive=True for multiple consumers
telemetry_q = channel.queue_declare(queue='telemetry_queue', exclusive=True)
telemetry_q_name = telemetry_q.method.queue

event_q = channel.queue_declare(queue='event_queue', exclusive=True)
event_q_name = event_q.method.queue

emergency_q = channel.queue_declare(queue='emergency_queue', arguments={"x-max-priority": X_MAX_PRIORITY}, exclusive=True)
emergency_q_name = emergency_q.method.queue

channel.queue_bind(exchange=EXCHANGE_NAME, queue=telemetry_q_name,arguments = {'type': 'TELEMETRY','x-match':'all'})
channel.queue_bind(exchange=EXCHANGE_NAME, queue=event_q_name,arguments = {'type': 'EVENT', 'x-match':'all'})
channel.queue_bind(exchange=EXCHANGE_NAME, queue=emergency_q_name,arguments = {'type': 'EMERGENCY', 'x-match':'all'})

print(' [*] Waiting for events. To exit press CTRL+C')

def callback(ch, method, properties, body):
    print(" Received : %r"%body)

channel.basic_consume(
    queue=telemetry_q_name, on_message_callback=callback, auto_ack=True)

channel.basic_consume(
    queue=event_q_name, on_message_callback=callback, auto_ack=True)
#need nack
channel.basic_consume(
    queue=emergency_q_name, on_message_callback=callback, auto_ack=True)

channel.start_consuming()