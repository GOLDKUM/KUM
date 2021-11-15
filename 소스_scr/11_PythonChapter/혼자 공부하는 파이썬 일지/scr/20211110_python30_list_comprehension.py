array=[]

# for i in range(0,20,2):
#     array.append(i*i)
array=[i*i for i in range(0,20,2) if i%2==0]
array_1 = [i for i in range(10)]
array_2 = [i for i in range(0,10,2)]
array_3 = [i for i in range(10)]
print(array)
print(array_1)
print(array_2)
print(array_3)

#이를 활용해서 1~100 사이에 있는 숫자 중 2진수로 변환했을 떄 0이 하나만 포함된 숫자를 찾고
#, 그숫자들의 합을 구하는 코드를 만들어 보세요.
# 1~100 /2진수/ 0이 하나만 포함된 숫자 >합! 
output=0
for i in range(1,100+1):
    if "{:b}".format(i).count("0") == 1:
        print("{},{:b}".format(i,i))
        output+=i
print("합계:{}".format(output))

output_list=[]
output_list=[i for i in range(1,100+1) if"{:b}".format(i).count("0") == 1 ]
print(output_list)
print("합계는",sum(output_list))