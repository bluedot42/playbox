# Python 2.7.6
# stomp.py v4.1.5 (https://pypi.python.org/pypi/stomp.py)

import time
import stomp

# class MyListener(stomp.ConnectionListener):
#     def on_message(self, headers, message):
#         print('MyListener:\nreceived a message "{}"\n'.format(message))
#         global read_messages
#         read_messages.append({'id': headers['message-id'], 'subscription':headers['subscription']})

class MyStatsListener(stomp.StatsListener):
    def on_disconnected(self):
        super(MyStatsListener, self).on_disconnected()
        print('MyStatsListener:\n{}\n'.format(self))

read_messages = []
hosts = [('127.0.0.1', 61613)]

conn = stomp.Connection12(host_and_ports=hosts,vhost='vhost-browser')
# conn.set_listener('my_listener', MyListener())
conn.set_listener('stats_listener', MyStatsListener())
# wait=True means that it waits until it's established a connection with the server before returning.
conn.connect('browser','browser',wait=True)
# id should uniquely identify the subscription
# ack = auto, client, or client-individual
# See https://stomp.github.io/stomp-specification-1.1.html#SUBSCRIBE_ack_Header
# conn.subscribe(destination='test.req', id=1, ack='client-individual')
conn.send(body="A Test message", destination='/topic/heatmap')
time.sleep(3)
for message in read_messages:
    conn.ack(message['id'], message['subscription'])
# conn.disconnect()

# Script output ...
#
# MyListener:
# received a message "A Test message"
#
# MyStatsListener:
# Connections: 1
# Messages sent: 5
# Messages received: 1
# Errors: 0