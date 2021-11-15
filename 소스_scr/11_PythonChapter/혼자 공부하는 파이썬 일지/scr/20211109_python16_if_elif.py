number =int(input("정수를 입력해주세요"))
if number%2==0:
    print("짝수입니다")
elif number%2==1:
    print("홀수입니다")

import datetime
now=datetime.datetime.now()
if 3<=now.month<=5:
    print("이번 달은 {}월로 봄입니다".format(now.month))
elif 6<=now.month<=8:
    print("이번 달은 {}월로 여름입니다".format(now.month))
elif 9<=now.month<=11:
    print("이번 달은 {}월로 가을입니다".format(now.month))
else :
    print("이번 달은 {}월로 겨울입니다".format(now.month))

#ex
score =float(input("> 학점을 입력해주세요"))
if score==4.5:
    print("신")
elif 4.0<=score:
    print("교수님의 사랑")
elif 3.0<=score:
    print("현 체체의 수호자")
elif 2.0<=score:
    print("일반인")
else:
    print("일탈을 꿈꾸는 시민")