# 1.인덱스로제거
# 	-del연산자	
a=[1,2,3,4,5,6,7]
del a[1]
del a[0:3]
print(a)
# 	-pop()함수
a=[1,2,3,4,5,6,7]
a.pop(1)
print(a)
a.pop()
print(a)
# 2.값으로 제거
# 	-remove()함수 
a=[100,200,300,400,500]
a.remove(100)
print(a)
#clear
a.clear()
print(a)