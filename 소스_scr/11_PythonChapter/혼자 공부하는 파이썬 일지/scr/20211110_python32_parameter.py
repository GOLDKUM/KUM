def print_n_times(value,n):
    for i in range(n):
        print(value)


#print_n_times("안녕하세요")error
#print_n_times("안녕하세요",5,1)error
print_n_times("안녕하세요",5)

#가변매개변수
def 함수이름 (매개변수1,매개변수2,*가변매개변수):
    print(매개변수1)
    print(매개변수2)
    print(가변매개변수)
함수이름(0,1,2,3,4,5,6,7,8,9)

#기본매개변수
def print_n_times(value,n=5):
    for i in range(n):
        print(value)
print_n_times("안녕하세요")
