package com.lec.ex3_Set;

import java.util.HashSet;
import java.util.Iterator;
// toString override equals override
public class Ex03_StudentSet {
	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();
		Student s = new Student("�̼���",6);
		students.add(s);
		students.add(s);//s.equals(s) �񱳽��� true�� s.hashcode() s.hashcode()
		System.out.println(students);
		students.add(new Student("ȫ�浿",5));
		students.add(new Student("�庸��",1));
		students.add(new Student("�庸��",1));//�ּҸ� ���� ���ٰ��� 
		System.out.println(students);
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		
	}

}
