#tuple
a=(1,2,3,4)
print(a[0])
print(a[1])
print(a[2])
print(a[3])

[a,b]=[10,20]
(c,d)=30,40
print(c,d)
a,b=10,20
print(a,b)
a,b=b,a
print(a,b)

a,b=97,40
print(divmod(a,b))# 몫,나머지
몫,나머지=divmod(a,b)
print(몫)
print(나머지)

for i, value in enumerate([1,2,3,4,5,6]):
    print("{}번쨰 요소는 {}입니다".format(i,value))

def test():
    return 10,20

a,b=test()
print(a,b)

print([273])
print(type(273))
print(type((273,)))#요소가 하나있는 튜블

a={
    "숫자":"o",
    "문자열":"o",
    "불":"o",
    "리스트":"x",
    "튜블":"o"
}

a={
    (0,0):10,
    (0,1):20,
    (1,0):30,
    (1,1):40
}
