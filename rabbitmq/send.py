#!/usr/bin/python3

import pika

credentials = pika.PlainCredentials('test','test')
conn = pika.BlockingConnection(pika.ConnectionParameters('localhost',5672,'/',credentials))
channel = conn.channel()

channel.queue_declare(queue="hello")

channel.basic_publish(exchange='',routing_key='hello',body='hello world')
print("[x] Sent 'Hello World!'")

conn.close()