#숫자의 종류
##소수점이 없는 숫자 (정수)
1,2,3,4,10,12391239103
10
#Integer:int

##소수점이 있는 숫자(정수 < 실수)
52.273, 56.103
10.0 
#Floating point : Float

#존재하지 않는 수 = 허수 (정수<실수<복소수)
10+1j

#숫자에 적용하는 연산자
print(type(273))
print(type(273.0))
print(type(273.0+10j))

print(10+20)
print(10.0+20.0)
print(10-20)
print(10*20)
print(10/20)
print(2**3)
print(15%2)
print(7/2)
print(7//2)
print("3462를 17로 나누었을 떄의")
print("- 목", 3462//17)
print("- 나머지 :",3462%17)

#연산자 우선 순위
print(2(+2*2))

#typeerror
print(100+"안녕하세요")
print(100-"안녕하세요")
print(100/"안녕하세요")

