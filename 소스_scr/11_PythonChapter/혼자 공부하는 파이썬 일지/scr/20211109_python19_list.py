#append(),insert(),extend()
list_a=[1,2,3]
list_a.append(4)
list_a.insert(1,9)
list_a.extend([5,6,7])

#파괴적함수, 비파과적함수
#비파과적함수
a="hello"
print(a.upper())
print(a)


#파괴적함수
b=[1,2,3]
b.append(5)
print(b)
#번외 
c=b+[4]
print(c)