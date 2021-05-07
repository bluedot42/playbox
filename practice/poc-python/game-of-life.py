# -*- coding: utf-8 -*-
"""
Created on Mon Jun 29 09:29:46 2020

@author: MAU2SGH
"""

import matplotlib
import numpy as np
import matplotlib.pyplot as plt

def iterate(Z):
    N = (Z[0:-2,0:-2] + Z[0:-2,1:-1] + Z[0:-2,2:] +
         Z[1:-1,0:-2]                + Z[1:-1,2:] +
         Z[2:  ,0:-2] + Z[2:  ,1:-1] + Z[2:  ,2:])
    birth = (N==3) & (Z[1:-1,1:-1]==0)
    survive = ((N==2) | (N==3)) & (Z[1:-1,1:-1]==1)
    Z[...] = 0
    Z[1:-1,1:-1][birth | survive] = 1
    return Z


Z = np.random.randint(0,2,(256,512))
for i in range(100):
    iterate(Z)

size = np.array(Z.shape)
dpi = 72.0
figsize= size[1]/float(dpi),size[0]/float(dpi)
fig = plt.figure(figsize=figsize, dpi=dpi, facecolor="white")
fig.add_axes([0.0, 0.0, 1.0, 1.0], frameon=False)
plt.imshow(Z,interpolation='nearest', cmap=plt.cm.gray_r)
plt.xticks([]), plt.yticks([])
plt.savefig('./figures/game-of-life-big.png', dpi=dpi)
plt.show()