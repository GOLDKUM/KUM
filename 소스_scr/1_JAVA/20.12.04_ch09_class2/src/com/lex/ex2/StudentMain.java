package com.lex.ex2;

public class StudentMain {public static void main(String[] args) {
//	Student s1 = new Student("���켺", 90, 90, 90);
//	Student s2 = new Student("���ϴ�", 81, 90, 90);
//	Student s3 = new Student("Ȳ����", 91, 90, 90);
//	Student s4 = new Student("������", 80, 90, 90);
//	Student s5 = new Student("������", 70, 90, 90);
	Student[] student = {new Student("���켺", 90, 90, 90),
						new Student("���ϴ�", 81, 90, 90),
						new Student("Ȳ����", 91, 90, 90),
						new Student("������", 80, 90, 90),
						new Student("������", 70, 90, 90)};
	String[] title = {"�̸�","����","����","����","����","���"};
	System.out.println("�������������������������������������������������������������������");
	System.out.println("\t\t\t\t����ǥ");
	System.out.println("\t--------------------------------------------------");
//	for(int i=0 ; i<title.length ; i++) {
//		System.out.print("\t "+title[i]);
//	}
	for(String t : title) {
		System.out.print("\t"+t);
	}
	System.out.println();
	System.out.println("\t--------------------------------------------------");
	for(Student s : student) {
		s.print();
	}
	System.out.println("�������������������������������������������������������������������");
	
}
	
	
}


//for(int i=0; i <title.length; i ++){
//system.out.print("\t"+title[i]);