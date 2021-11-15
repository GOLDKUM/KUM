#try:
#예외가 발생할 가능성이 있는 코드
#except:
#예외가 발생했을 경우 실행할 코드
#(finally:):옵션[필요에 따라서 사용]
#무조건적으로 실행하는 코드 
try:
    number = int(input("> 정수 입력"))
    print("입력 값은 {}입니다".format(number))
except:
    print("예외가 발생했습니다.")
    #pass
finally:
    #무조건적으로 실행사는 코드
    print("무조건적으로 실행됩니다.")

#함수를 선언합니다
def write_text_file(filename, text):
    #try except 구문을 사용합니다.
    try:
        #파일을 엽니다
        file=open(filename,"w")
        #여러 가지 처리를 수행합니다.
        return
        #파일에 텍스트를 입력합니다
        file.write(text)
    except Exception as e:
        print(e)
    finally:
        #파일을 닫습니다.
        file.close()
    #함수를 호출합니다.
    write_text_file('text.txt1',"안녕하세요")