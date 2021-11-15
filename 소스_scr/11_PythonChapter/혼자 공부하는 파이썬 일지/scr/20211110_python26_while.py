# while <불표현식>:
    #구문 실행
i=0
while True:
    print(",",end='')
    i+=1
    break

numbers=[1,2,1,2,1,2]
numbers.remove(1)
print(numbers)

while 1 in numbers:
    numbers.remove(1)
    print(numbers)

import time
print(time.time()) 
first=time.time()
while first+5>time.time():
    pass
print("프로그램이 종료되었습니다.") 