#대상
#-텍스트파일:
#-바이너리 파일:(이미지,동영상,워드,엑셀,PDF)

#어떻게 다룰 것인가
#-쓰기
    #-새로(write):w
    #-있는 파일 뒤에 (append):a
#-읽기(read):r

#open()
#save()
file = open("text.txt","w")
file.write("안녕하세요")
file.close()

file = open("text.txt","r")
print(file.read())
file.close()

with open("text.txt","r") as file:
    file.write("안녕하세요.")
