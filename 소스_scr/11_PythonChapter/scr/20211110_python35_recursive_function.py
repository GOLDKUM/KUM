#n!=1*2*3*...*n
from typing import Counter


def factorial_1(n):
    변수 =1
    for i in range(1,n+1):
        변수 *=i
    return 변수

#n!=n*(n-1)!
#0!=1
def factorial_2(n):
    if n == 0:
        return 1
    else:
        return n * factorial_2(n-1)
print(factorial_1(3))
print(factorial_2(3))

#f(1)=1
#f(2)=1
#f(3)=f(2)+f(1)=2
#f(4)=f(3)+f(2)=3

counter_count = 0
def f(n):
    global counter_count
    counter_count+=1
    if n==1 or n==2:
        return 1
    else:
        return f(n-1)+f(n-2)
print(f(10))
print(counter_count)

#메모화
메모 = {
    1:1,
    2:1
}
def f(n):
    if n in 메모:
        return 메모[n]
    else:
        output=f(n-1)+f(n-2)
        메모[n]=output
        return output
print(f(150))

#조기리턴
def f(n):
    if n in 메모:
        return 메모[n]

    output=f(n-1)+f(n-2)
    메모[n]=output
    return output
print(f(150))