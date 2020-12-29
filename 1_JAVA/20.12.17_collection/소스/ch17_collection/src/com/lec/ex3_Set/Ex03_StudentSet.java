package com.lec.ex3_Set;

import java.util.HashSet;
import java.util.Iterator;
// toString override equals override
public class Ex03_StudentSet {
	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();
		Student s = new Student("이순신",6);
		students.add(s);
		students.add(s);//s.equals(s) 비교실행 true면 s.hashcode() s.hashcode()
		System.out.println(students);
		students.add(new Student("홍길동",5));
		students.add(new Student("장보고",1));
		students.add(new Student("장보고",1));//주소를 보거 같다고함 
		System.out.println(students);
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		
	}

}
