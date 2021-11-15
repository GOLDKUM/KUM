class Student:
    def to_string(self):
        return "{} {}살".format(self.이름,self.나이)
    def __eq__(self,other):
        print("eq()함수")
        return self.나이 == other.나이
    def __ne__(self,other):
        print("ne()함수")
    def __gt__(self,other):
        print("gt()함수")
    def __ge__(self,other):
        print("ge()함수")
    def __lt__(self,other):
        print("lt()함수")
    def __le__(self,other):
        print("le()함수")

    def __str__(self):
        return "{} {}살".format(self.이름,self.나이)
    def __init__(self,이름,나이):
        print("객체가 생성되었습니다.")
        self.이름=이름
        self.나이=나이
        pass
    def __del__(self):
        print("객체개 소멸되었습니다.")
    def 출력(self):
        print(self.이름,self.나이)

student=Student("윤인성",3)
print(student == student)
print(student != student)
student > student
student >= student
student < student
student <= student

print(student.이름,student.나이)
student.출력()
print(str(student))
print("1")
print(student.to_string())