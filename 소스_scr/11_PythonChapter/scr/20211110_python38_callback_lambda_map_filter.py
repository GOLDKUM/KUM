def call_10_times(func):
    for i in range(10):
        #콜백함수(callback)
        func(i)

#def print_hello(number):
#    print("안녕하세요",number)

#call_10_times(print_hello)
call_10_times(lambda number:print("안녕하세요",number))

#filter()
#map()
def 짝수만(number):
    return number % 2 ==0
def 출력(number):
    return str(number)
a=list(range(100))
b=filter(짝수만,a)
print(b)
#for i in b:
#    print(i)
print(list(b))
#print(짝수만(50))
#print(출력(123))

a=list(range(100))
b=filter(lambda number:number % 2 ==0,a)
print(list(b))

#map()#리스트기반을 새로운 리스트
def 제곱(number):
    return number*number
a=list(range(100))
print(list(map(제곱,a)))
print(list(map(lambda number:number*number,a)))
print([i*i for i in a if i%3==0])