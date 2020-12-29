package com.lec.ex04shape;

public abstract  class Shape {
	public void draw() {
		System.out.println("도형을 그려요");
	}//메소드
	public abstract void computeArea();//추상메소드

}
