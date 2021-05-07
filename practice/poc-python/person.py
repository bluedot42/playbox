# -*- codinng: utf-8 -*-


class Person:

    def __init__(self, name, job=None, pay=0):
        self.name = name
        self.job = job
        self.pay = pay

    def lastName(self):
        return self.name.split()[-1]

    def giveRaise(self, percent):
        self.pay = int(self.pay*(1+percent))

    def __str__(self):
        return '[PERSON %s, %s, %d]' % (self.name, self.job, self.pay)
