
a=int(input("첫 번쨰 숫자를 입력해주세요"))
b=int(input("두 번쨰 숫자를 입력해주세요"))
c=float(input("첫 번쨰 숫자를 입력해주세요"))
d=float(input("두 번쨰 숫자를 입력해주세요"))

#int()함수:정수
#float():부동소수점 -1.0,2.0,3.0,-1.0
print(a+b) 
e=str(input("입력해주세요 "))
print(type(e))

#ex
num_input = float(input("숫자 입력>"))
print()
print(num_input,"inch")
print((num_input * 2.54),"cm")

#ex2
num_input=float(input("원의 반지름 입력"))
print()
print("반지름",num_input)
print("둘레",2*3.14*num_input)
print("넓이",3.14*num_input**2)

#ex3
a=input("문자열 입력")
b=input("")

print(a,b)
c=b
b=a
a=c
print(a,b)
a,b=b,a
print(a,b)
