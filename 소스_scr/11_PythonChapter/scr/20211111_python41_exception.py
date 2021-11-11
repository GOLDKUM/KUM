#구문 오류 발생
while True:
    #숫자를 입력받습니다. 
    string_input = input("정수 입력>")
    if string_input.isdigit():
        number_input_a=int(input("정수 입력>"))
    #출력합니다
        print("원의 반지름:",number_input_a)
        print("원의 둘레:",2*3.14*number_input_a)
        print("원의 넓이:",3.14*number_input_a*number_input_a)
        break
    else:
        print("정수를 입력해주세요!")