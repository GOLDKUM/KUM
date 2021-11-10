"""
리스트에 적용할 수 있는 기본 함수: min(),max(),sum()
리스트 뒤집기 :reversed()
현재 인덱스가 몇 번쨰인지 확인하기 : enumerate()
딕셔너리로 쉽게 반복문 작성하기: items()
"""
print(min([273,52,103,32,15]))
print(max([273,52,103,32,15]))
print(sum([273,52,103,32,15]))

a=[0,1,2,3,4,5]
reversed_a=reversed(a)
print(list(reversed_a))#일회성 
print(list(reversed_a))
#list(reversed(리스트)):리스트 역으로 돌리기
#for i in reversed(리스트):반복문에 적용하기

kum=[273,103,52,32,57]
print(list(enumerate(kum)))
for (i,element) in enumerate(kum):
    print("{}번쨰 요소는 {}입니다".format(i,element))
print("---")
for (i,element) in enumerate(kum):
    print("{}번쨰 요소는 {}입니다".format(i,element))


gold={
    "key_1":"value_1",
    "key_2":"value_2",
    "key_3":"value_3"
}
for key, value in gold.items():
    print("{}키의 값은 {}입니다".format(key,value))
