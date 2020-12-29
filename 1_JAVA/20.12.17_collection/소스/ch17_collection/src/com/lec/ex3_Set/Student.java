package com.lec.ex3_Set;
//�̸�, �г�,  new Student("ȫ�浿",5)
//equals override
public class Student {
	private String name;
	private int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;		
	}
	@Override
	public String toString() {
		return name+":"+grade;
	}
	@Override//new Student("�庸��",1).equals(new Student("�庸��",1))
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj!=null&& obj instanceof Student) {
			boolean nameChk=name.equals(((Student)obj).name);
			boolean gradeChk=grade == ((Student)obj).grade;
			return nameChk && gradeChk;
			
//			return toString().equals(obj.toString());
//			
		}
		return false;
	}

	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		
		return toString().hashCode();
			// "�庸��:1"
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	

}
