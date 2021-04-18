from django.shortcuts import render
from students.models import Student
from django.http import HttpResponseRedirect
from django.urls import reverse

from django.shortcuts import redirect


# 학생 목록
def listAll(request):
    qs = Student.objects.all()
    context = {'student_list': qs}
    return render(request, 'students/studentListAll.html', context)


# 학생 등록
def registerStudent(request):
    return render(request, 'students/registerStudent.html')


# 학생 등록 입력받아 DB에 저장
def registerConStudent(request):
    name = request.POST['name']
    major = request.POST['major']
    age = request.POST['age']
    grade = request.POST['grade']
    gender = request.POST['gender']
    qs = Student(s_name=name, s_major=major, s_age=age, \
                 s_grade=grade, s_gender=gender)
    qs.save()
    return HttpResponseRedirect(reverse('students:listAll'))


# 상세보기
def detailStudent(request, name):
    try:
        qs = Student.objects.get(s_name=name)
    except:
        qs = Student.objects.filter(s_name__contains=name)
    context = {'student': qs}
    return render(request, 'students/detailStudent.html', context=context)


# 학생 수정
def modifyStudent(request, name):
    try:
        qs = Student.objects.get(s_name=name)
    except:
        qs = ''
    context = {'student': qs}
    return render(request, 'students/modifyStudent.html', context=context)

# 학생 수정 정보 DB에 반영
def modifyConStudent(request):
    name  = request.POST['name']
    major = request.POST['major']
    age   = request.POST['age']
    grade = request.POST['grade']
    gender = request.POST['gender']
    qs = Student.objects.get(s_name=name)
    qs.s_major = major
    qs.s_age = age
    qs.s_grade = grade
    qs.s_gender = gender
    qs.save()
    return HttpResponseRedirect(reverse('students:listAll'))
# 학생 삭제
def deleteStudent(request, name):
    try:
        qs = Student.objects.get(s_name=name)
        qs.delete()
        print(name, '삭제 성공')
    except:
        print(name, '삭제 실패')
    return redirect('/students/listAll')