package com.lec.ex08;

public class Child1 extends Parent {
	private int c1=1;
	public Child1() {
		System.out.println("Child1형 객체 생성");
	}
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
}
