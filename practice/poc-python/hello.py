# for i in range(10,99):
#     if (i/10)<(i%10):
#         print(i)

# import math
#
# def rootCal(x):
#     (a,b,c) = x
#     return ((-b+math.sqrt(b*b-4*a*c))/(2*a),(b+math.sqrt(b*b-4*a*c))/(2*a))
#
# print(rootCal([2,3,0]))
# print(rootCal([1,-6,5]))

# def avg(*args):
#     sum=0
#     for i in args:
#         sum+=i
#     return sum/len(args)
#
# print(avg(1))
# print(avg(1,2,3))

# def cap(str):
#     return str[0].upper()+str[1:]
#
# print(cap('abc'))
#
#
# def log(f):
#     def fn(x):
#         print("Call "+fn.__name__+"()...")
#         return f(x)
#     return fn
#
# def factorial(n):
#     return reduce(lambda x,y:x*y,range(1,n+1))
#
# passline = 60
#
# def func(val):
#     if val  >= passline:
#         print("Pass")
#     else:
#         print("Fail")
#     def in_func():
#         print(val)
#
#     return in_func
#
# f = func(89)
# f()
# f()

# def set_passline(line):
#     def cmp(val):
#         if val>=line:
#             print("PASS")
#         else:
#             print("FAIL")
#     return cmp
#
# pass100 = set_passline(60);
# pass150 = set_passline(90);
#
# pass100(89)
# pass150(89)
#
#
# print(pass100.__closure__)
# print(pass150.__closure__)

def dec(func):
    print('DEC 1')
    def comm_util(*args):
        print('DEC 2')
        if len(args) == 0:
            return 0
        for v in args:
            if not isinstance(v, int):
                return 0
        return func(*args)

    return comm_util

@dec
def my_sum(*args):
    tmp = 0
    print('in my_sum')
    return sum(args)

def my_avg(*args):
    print('in my_avg')
    return sum(args)/len(args)

# my_sum = dec(my_sum)
print(my_sum(1,2,3))
# print(my_sum.__closure__)