#문자열.함수(매개변수,매개변수)
print("{},{},{},{}".format(1,2,3,4))
print("{}년,{}월,{}일,{}요일".format(2019,12,9,"월"))

#upper() lower()
print("hEllo".upper())
print("Hello".lower())

#strip
print("       문자 공백 제거      ".strip())
print("       문자 공백 제거      ".lstrip())
print("       문자 공백 제거      ".rstrip())

#find,rfind
print("가나다라마바사".find("라"))
print("가나다라마바사".find("가"))
print("가나다라마바사".find("응"))
print("가나다라마바사가나다".rfind("나"))
print("가나다라마바사가나다".find("나"))

#in
print("가" in "가나다라마")

#split()
print("10 20 30 40 50".split(" "))

#ex
a= input("> 1번쨰 숫자:")
b= input("> 2번쨰 숫자:")
print()

print("{}+{}={}".format(a,b,int(a)+int(b)))

#ex01
string="hello"
#string.upper()를 실행하고, string 출력하기
print("A지점",string)
print("B지점",string.upper())
