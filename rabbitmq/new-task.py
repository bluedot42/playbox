#!/usr/bin/env python
import pika
import sys
import time
import random
from timeloop import Timeloop
from datetime import timedelta

tl = Timeloop()

credentials = pika.PlainCredentials('test','test')
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost',5672,'/',credentials))
channel = connection.channel()

channel.queue_declare(queue='task_queue', durable=True)

MIN = 1
MAX = 30

def generateMsg():
    task = random.randint(MIN,MAX)
    return 'Task'+'['+str(task)+']:'+'.'*task

@tl.job(interval=timedelta(seconds=2))
def sendMsg():
    message = generateMsg()
    channel.basic_publish(
            exchange='',
            routing_key='task_queue',
            body=message,
            properties=pika.BasicProperties(
                delivery_mode=2,  # make message persistent
            ))
    print(" [x] Sent %r" % message)
    # time.sleep(1)

if __name__ == "__main__":
    tl.start(block=True)