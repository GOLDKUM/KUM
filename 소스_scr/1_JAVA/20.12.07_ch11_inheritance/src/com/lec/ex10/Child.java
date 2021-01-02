package com.lec.ex10;
// 부모단의 클래스에 매개변수 없는 생성자가 없음
public class Child extends Parent {
	public Child(int i) {
		super(i); // 항상 매개변수 있는 부모단 생성자 호출
	}
}
