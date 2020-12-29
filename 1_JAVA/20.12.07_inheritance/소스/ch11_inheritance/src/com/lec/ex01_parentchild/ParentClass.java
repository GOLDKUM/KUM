package com.lec.ex01_parentchild;
// 상속해준 클래스 : parent class, super class, 부모클래스
public class ParentClass {
	String pStr = "부모클래스";
	public ParentClass() {
		System.out.println("부모클래스 객체 부분 생성");
	}
	public void getPapaName() {
		System.out.println("아빠이름 : 홍길동");
	}
	public void getMamiName() {
		System.out.println("엄마이름 : 김길순");
	}
}
