# for <요소 변수 이름> in 리스트:
    #코드
a=[1,2,3,4,5,6,7]
for element in a:
    print(element,end=' ')

list_a=[0,1,2,3,4,5,6,7]
list_a.extend(list_a)
list_a.append(10)
list_a.insert(3,0)
list_a.remove(3)
list_a.pop(3)
list_a.clear()

numbers=[273,103,5,32,65,9,72,800,99]
for number in numbers:
    if number >=100:
        print("-100 이상의 수 :{}".format(number))

for number in numbers:
    if number %2==0:
        print("{}은 짝수입니다.".format(number))
    else:
        print("{}은 홀수입니다.".format(number))

for number in numbers:
    print("{}는 {}자리수입니다".format(number,len(str(number))))

list_of_list=[\
    [1,2,3],
    [4,5,6,7],
    [8,9]]

for list in list_of_list:
    for a in list:
        print(a)

numbers=[1,2,3,4,5,6,7,8,9]
output=[[],[],[]]

for number in numbers:
    output[(number-1)%3].append(number)
print(output)

holzzak=["짝수","홀수"]
for number in numbers:
    print("{}는 {}입니다".format(number,holzzak[number%2]))