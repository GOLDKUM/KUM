
def 외부데코레이터(number):
    print("외부데코레이터")
    def 데코레이터(함수):
        print("미리 어떤 처리를 진행합니다.",number)
        return 함수
    return 데코레이터

@외부데코레이터(number=100)#테스트 = 데코레이터(테스트)
def 테스트():
    print("안녕하세요")

테스트()

#클래스 >  최상위 부모클래스 무조건 상속!!
class 부모:
    def 테스트(self):
        print("안녕하세요")
class 자식(부모):
    pass

c=부모()
print(부모.mro())
c.테스트()