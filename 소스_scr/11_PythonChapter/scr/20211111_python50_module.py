# python documentation tool
import sys

#명령 매개변수
print(sys.argv)

from datetime import datetime
now= datetime.now()
now=datetime(2000,1,1,1,1,1)
print(now.year)
#0~11
#1~12
print(now.month)
print(now.day)
print(now.hour)
print(now.minute)
print(now.second)

import time
print('A')
time.sleep(2)
print('B')

from urllib import request
target = request.urlopen("http://hanbit.co.kr")
content=target.read()
print(content)
print(content[:100])