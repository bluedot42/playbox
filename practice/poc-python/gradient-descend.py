# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import numpy as np

X = np.array([1,2,4,6,8,10,12,13,14,16,16,18,20,22,24])
Y = np.array([39,42,43,46,47,56,60,59,64,66,68,72,71,75,80])

np.random.seed(2)
epochs=15
learning_rate = 0.001
w = np.random.randn()
b = np.random.randn()
y_pred = np.empty(len(Y))
for i in range(epochs):
   print("-----------epoch:{}--------".format(i))
   #prediction
   y_pred = w*X +b
   
   #Error/loss calculation is Mean Squared Error
   error = np.mean((Y - y_pred)**2)
   print('Total Error:{}'.format(error))
   
   #Gradient calculation
   gradient_a = np.mean(-2*X*(Y-y_pred))
   gradient_b = np.mean(-2*(Y-y_pred))
   
   #Update weights
   w -= learning_rate*gradient_a
   b -= learning_rate*gradient_b