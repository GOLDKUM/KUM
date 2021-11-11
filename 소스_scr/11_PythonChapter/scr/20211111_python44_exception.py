try:
    number=int(input("정수 입력>"))
    print("원의 반지름:",number)
    print("원의 둘레:",2*3.14*number)
    print("원의 넓이:",3.14*number*number)

except Exception as e:
    print("예외가 발생했습니다.")
    print(e)
    print(type(e))



try:
    a=[273,103,52,57,100]
    number = int(input("정수 입력 0~4까지 입력해주세요"))
    print(number)
except ValueError as exception:
    print("값에 문제가 있습니다")
except IndexError as exception:
    print("0~4까지를 입력해주세요.")
except ValueError as exception:
    print("알 수 없는 예외가 발생했습니다.")
#except Exception as exception:
#    if type(exception) == ValueError:
#        print("값에 문제가 있습니다")
#    elif type(exception) == IndentationError:
#        print("0~4까지를 입력해주세요.")

#raise 예외 객체 
raise Exception("안녕하세요")
def suspicious(request):
    raise SuspiciousOperation('dubious')

