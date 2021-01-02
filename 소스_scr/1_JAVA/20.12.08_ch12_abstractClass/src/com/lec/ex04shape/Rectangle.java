package com.lec.ex04shape;
//데이터 생선자 메소드 get set 
public class Rectangle extends Shape {
	private int w ;//가로
	private int h ;//세로
	

	public Rectangle() {}
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public void computeArea() {
		System.out.println("사격형의 넓이는"+(w*h));

	}
	@Override
	public void draw() {
		System.out.println("사각형");
		super.draw();
	}

}
