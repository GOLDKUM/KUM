# if<조건>:
#   조건이 참일떄 실행할 문장 
#   조건이 참일떄 실행할 문장 
if True:
    print("True 입니다")
if False:
    print("False 입니다")

#if 조건문 만들어 보기(2):사용자 입력 기반 조건
number = input("정수 입력")
number = int(number)

if number >0:
    print("양수 입니다")
elif number ==0:
    print("0입니다")
elif number<0:
    print("음수입니다.")

import datetime
now=datetime.datetime.now()

if now.hour<12:
    print("현재 시간은 {}시 {}분로 오전입니다".format(now.hour,now.minute))
elif now.hour>12:
    print("현재 시간은 {}시 {}분로 오후입니다".format(now.hour,now.minute))

if 3<=now.month<=5:
    print("이번 달은 {}월로 봄입니다".format(now.month))
elif 6<=now.month<=8:
    print("이번 달은 {}월로 여름입니다".format(now.month))
elif 9<=now.month<=11:
    print("이번 달은 {}월로 가을입니다".format(now.month))
elif now.month<=12 or 1<=now.month<=2:
    print("이번 달은 {}월로 겨울입니다".format(now.month))
# print(now.year)
# print(now.month)
# print(now.day)
# print(now.hour)
# print(now.minute)
# print(now.second)

number = input("정수를 입력해주세요")
#홀수와 짝수 
last_character=number[-1]
last_character=int(last_character)
# if last_character in"02468":
#     print("짝수입니다")
# elif last_character in "13579":
#     print("홀수입니다")
if last_character%2==0:
    print("짝수입니다")
elif last_character%2==1:
    print("홀수입니다")