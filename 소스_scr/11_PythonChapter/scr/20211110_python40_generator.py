#제너레이터
#간단하게 "이터레이터를 직접 만들 떄 사용하는 구문"
#함수 내부에 yield 라는 키워드가 포함되면 해당 함수는 제너레이터가 됩니다.
def reversed_text (list_text):
    for i in range(len(list_text)):
        yield list_text[-i-1]
for i in reversed_text([1,2,3,4,5]):
    print(i)
numbers=[1,2,3,4,5,6]
print("::".join(
    map(str,numbers)
))

numbers=list(range(1,10+1))
print("# 홀수만 추출하기")
print(list(filter(lambda number: number%2==1,numbers)))
print()

print("# 3이상, 7미만 추출하기")
print(list(filter(lambda number:3<=number<7,numbers)))
print()

print("# 제곱해서 50미만 추출하기")
print(list(filter(lambda number:(number**2) <50,numbers)))

#def 함수():
    #print("출력A")
    #yield 100 #멈춤
    #print("출력B")
    #yield 200
    #print("출력C")
    #yield 300
    #print("출력D")
    #yield 400

#print(함수())
#generator=함수()
#value=next(generator)
#print(value)
#next(generator)
#next(generator)

#for i in generator:#reversed 함수와 같이 일회성 iterater
#    print(i)