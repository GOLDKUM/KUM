package com.lec.ex05shape;

public abstract  class Shape {
	public void draw() {
		System.out.println("도형을 그려요");
	}//메소드
	public abstract double computeArea();//추상메소드 //넓이를 return 하는 메소드

}
