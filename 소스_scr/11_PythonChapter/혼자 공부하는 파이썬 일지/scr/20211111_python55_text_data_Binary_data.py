# 텍스트 데이터: 텍스트 편집기 편집 가능 
file = open("output.txt",'r')
data = file.read()
file.close()

file = open("output.txt","w")
file.write(data*3)
file.close()

#binary :이진수
#bit: 이진수로 표현된 데이터 하나 
#바이너리 데이터: 텍스트 편집기 편집 불가능 
