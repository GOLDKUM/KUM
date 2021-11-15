#range <= 자료형 range(시작,끝,단계)
print(list(range(0,10,1)))
print(list(range(0,10,2)))
print(list(range(0,10,3)))
print(list(range(10)))

for i in range(0,10,1):
    print(i)
for i in range(0,20,1):
    print(i)

i=0
array=[273,52,103,32,57]
for element in array:
    print("{}:{}".format(i,element))
    i+=1

for i,element in enumerate(array):
    print("{}:{}".format(i,element))

for i in range(len(array)):
    print("{}:{}".format(i,array[i]))

for i in range(9,-1,-1):
    print(i)
for i in reversed(range(0,10)):
    print(i)
for i in reversed(array):
    print(i)