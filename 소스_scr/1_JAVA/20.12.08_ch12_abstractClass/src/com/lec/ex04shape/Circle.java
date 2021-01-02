package com.lec.ex04shape;

public class Circle extends Shape {
	private int r;
	public Circle() {}
	public Circle(int r) {
		this.r=r;
	}

	@Override
	public void computeArea() {
		System.out.println("원의 넓이는"+(3.14*r*r));
	}
	@Override
	public void draw() {
		System.out.println("원");
		super.draw();
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}

}
