#!/usr/bin/env python
import pika
import sys
import time
import random
import json
from timeloop import Timeloop
from datetime import timedelta
from datetime import datetime

tl = Timeloop()

EXCHANGE_NAME = 'TELEMETRY'
MSG_TYPE = 'EVENT'
MSG_INTERVAL = random.randint(10,30)
MIN = 1
MAX = 10

credentials = pika.PlainCredentials('dozer','dozer')
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost',5672,'vhost-dozer',credentials))
channel = connection.channel()

channel.exchange_declare(exchange=EXCHANGE_NAME,exchange_type='headers')

# channel.queue_declare(queue='task_queue', durable=True)

def generateMsg():
    dateTimeObj = datetime.now()
    ts = dateTimeObj.strftime("%Y-%b-%d %H:%M:%S")
    msg = {"ts":ts,"msgID": random.randint(MIN,MAX), "messageType": MSG_TYPE}
    return json.dumps(msg)

@tl.job(interval=timedelta(seconds=MSG_INTERVAL))
def sendMsg():
    message = generateMsg()
    channel.basic_publish(
            exchange=EXCHANGE_NAME,
            routing_key='',
            body=message,
            properties=pika.BasicProperties(
                headers={"type":MSG_TYPE}
            ))
    print("["+MSG_TYPE+"] %r" % message)
    time.sleep(1)

if __name__ == "__main__":
    tl.start(block=True)