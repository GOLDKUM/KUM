#숫자는 무작위로 입력해도 상관없습니다.
key_list = ["name","hp","mp","level"]
value_list=["기사",200,30,5]
character={}

#작성합니다
for i in range(len(key_list)):
    character[key_list[i]]=value_list[i]

#최종 출력
print(character)
#{'name':'기사',"hp":200,'mp':30,'level':5}

#1부터 숫자를 하나씩 증가시키면서 더하는 경우를 생각해 봅시다. 몇을 더할 떄 1000을 넘는지 구해 보세요
# 그리고 그떄의 값도 출력해 보세요. 다음은 1000넘는 경우를 구한 예입니다.
#1,1+2=3,1+2+3=6,....
#limit = 1000
#i=1
#작성하시오
i=1
sum_value=0
limit=1000
while sum_value<limit:
    sum_value+=i
    i+=1
print("{}를 더할 떄 {}를 넘으면 그떄의 값은 {}입니다".format(i,limit,sum_value))

#1부터 100까지의 숫자가 있다고 합시다. 이를 다음과 같이 계산한다고 했을떄, 최대가 되는 경우는 어떤
#숫자를 곱했을 떄인지를 찾아 주세요.
# 1*99,2*98,3*97,.....98*2,99*1
#실행결과 최대가 되는 경우:50-50=2500
#작성하시오
max_value=0
for i in range(100):
    j=100-i
    print(i,j)
    #최대값 구하기
    if max_value <i*j:
        max_value=i*j
        a=i
        b=j
print("최대가 되는 경우{}*{}={}:".format(a,b,max_value))