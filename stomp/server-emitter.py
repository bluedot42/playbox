#!/usr/bin/env python
import sys
import time
import random
import json
import stomp
from timeloop import Timeloop
from datetime import timedelta
from datetime import datetime

tl = Timeloop()

MIN = 1
MAX = 10
MSG_TYPE = 'HEATMAP'
MSG_INTERVAL = 5

class MyStatsListener(stomp.StatsListener):
    def on_disconnected(self):
        super(MyStatsListener, self).on_disconnected()
        print('MyStatsListener:\n{}\n'.format(self))

read_messages = []
hosts = [('127.0.0.1', 61613)]

conn = stomp.Connection12(host_and_ports=hosts,vhost='vhost-browser')

conn.set_listener('stats_listener', MyStatsListener())
conn.connect('browser','browser',wait=True)

def generateMsg():
    dateTimeObj = datetime.now()
    ts = dateTimeObj.strftime("%Y-%b-%d %H:%M:%S")
    msg = {"ts":ts,"msgID": random.randint(MIN,MAX), "messageType": MSG_TYPE}
    return json.dumps(msg)

@tl.job(interval=timedelta(seconds=MSG_INTERVAL))
def sendMsg():
    message = generateMsg()
    conn.send(body=message, destination='/topic/heatmap')
    print("["+MSG_TYPE+"] %r" % message)
    # time.sleep(1)

if __name__ == "__main__":
    tl.start(block=True)