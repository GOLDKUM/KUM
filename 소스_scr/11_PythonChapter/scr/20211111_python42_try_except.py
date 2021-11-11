#try: 예외가 발생할 수 있는 가능성이 있는 코드
#except:   예외가 발생했을 떄 실행할 코드
while True:
    try:
        print(float(input("숫자를 입력해주세요"))**2)
        break
    except:
        print("숫자를 입력해주세요")
        #pass

#변수를 선언합니다
list_input_a = ["52","273","32","스파이","103"]

#반복을 적용합니다.
list_number= []
for item in list_input_a:\
    #숫자로 변환해서 리스트에 추가합니다.
    try:
        float(item)#예외가 발생하면 알아서 다음으로 진행은 No
        list_number.append(item)
    except:
        pass
#출력합니다
print("{}내부에 있는 숫자는".format(list_input_a))
print("{}입니다".format(list_number))

numbers =[52,273,32,103,90,10,275]
print("#(2) 요소 내부에 없는 값 찾기")
number=10000

try:
    print("-{}는 {} 위치에 있습니다".format(number,number.index(number)))
except:
    print("- 리스트 내부에 없는 값입니다")
print()