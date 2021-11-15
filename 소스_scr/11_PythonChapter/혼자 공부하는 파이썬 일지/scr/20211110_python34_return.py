def function():
    print("A")
    print("B")
    return 
    print("C")
    print("D")

print(function())

def 함수(매개변수):
    변수 = 초기값
    #여러가지
    return 변수
def sum_all(start,end):
    변수 = 0 
    for i in range(start,end+1):
        변수+=i
    return 변수

print(sum_all(1,100))

def f_1(x):
    return (2*x)+1
print(f_1(10))

def f_2(x):
    return (x**2)+(2*x)+1
print(f_2(10))

def mul(*values):
    변수=1
    for i in values:
        변수 *=i
    return 변수
print(mul(5,7,9,10))