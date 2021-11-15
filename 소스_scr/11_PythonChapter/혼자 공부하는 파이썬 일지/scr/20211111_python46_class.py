#스네이크케이스i_love_you
#캐멀케이스ILoveYou #클래스이름

class Student:
    def __init__(self,이름,나이):
        print("객체가 생성되었습니다.")
        self.이름=이름
        self.나이=나이
        pass
    def __del__(self):
        print("객체개 소멸되었습니다.")
    def 출력(self):
        print(self.이름,self.나이)
print("1")
student=Student("윤인성",3)
print("2")
print(student.이름,student.나이)
print("3")
student.출력()
print("4")
#클래스 (틀): 학생은 이름이라는 속성을 갖고있어!
#객체(실체화 된 것):학생 이름은 "윤인성"이야
#실체화 한 객체 ="인스턴스"
