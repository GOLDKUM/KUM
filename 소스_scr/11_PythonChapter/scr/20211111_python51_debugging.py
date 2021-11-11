#모듈을 읽어 들입니다.
import os

#현재 폴더의 파일/폴더를 출력합니다
output = os.listdir(".")
print("os.listdir():",output)
print()

#현대 폴더의 파일/폴더를 구분합니다.
print("#폴더와 파일 구분하기")
for path in output:
    if os.path.isdir(path):
        print("폴더:",path)
    else:
        print("파일",path)

#모듈을 읽어 들입니다.
import os

#폴더를 읽어 들이는 함수
def read_folder(path):
    #폴더의 요소 읽어들이기
    output = os.listdir(path)
    #폴더의 요소 구분하기
    for item in output:
        if os.path.isdir(path+"/"+item):
            #폴더라면 계속 읽어 들이기
            read_folder(path+'/'+item)
        else:
            #파일이라면 출력하기
            print("파일",item)
#현재 폴더의 파일/폴더를 출력합니다.
read_folder(".")
