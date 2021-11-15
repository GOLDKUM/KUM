#객체(object)
#=속성 + 행위

#사람 
#이름,키,나이,생년월일
#X:행위

#학생 리스트를 선언합니다.
def 학생_생성(name,korean,math,english,science):
    return{
        "name":name,
        "korean":korean,
        "math":math,
        "english":english,
        "science":science
    }

students=[
    {"name":"윤인성","korean":87,"math":47,"english":18,"science":45},
    학생_생성("금경용",99,99,99,99),
    {"name":"연하진","korean":77,"math":58,"english":28,"science":55},
    {"name":"구지연","korean":67,"math":68,"english":38,"science":65},
    {"name":"나선주","korean":57,"math":78,"english":48,"science":75},
    {"name":"윤아린","korean":47,"math":88,"english":58,"science":85},
    {"name":"윤명월","korean":37,"math":98,"english":68,"science":95},
]

def 총점(student):
    return student["korean"]+student["math"]+\
        student['english']+student['science']
def 평균(student):
    return 총점(student)/4
def 출력(student):
    print(student["name"],총점(student),평균(student), sep='\t')


print("이름","총점","평균",sep='\t')
for student in students:
    출력(student)
    


##학생을 한 명씩 반복합니다.
#print("이름","총점","평균",sep='\t')
#for student in students:
#    #점수와 총합과 평균을 구합니다.
#    score_sum=student["korean"]+student["math"]+\
#        student['english']+student['science']
#    score_average = score_sum/4
#    #출력합니다.
#    print("{},{},{}".format(student["name"],score_sum,score_average,sep='\t'))