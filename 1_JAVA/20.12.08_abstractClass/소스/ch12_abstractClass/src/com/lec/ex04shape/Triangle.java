package com.lec.ex04shape;

public class Triangle extends Shape {
	private int w;//�غ�
	private int h;//����
	public Triangle() {}

	public Triangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	@Override
	public void computeArea() {
		System.out.println("�ﰢ���� ���̴�"+(w*h*0.5));
	}
	@Override
	public void draw() {
		System.out.println("�ﰢ��");
		super.draw();
	}

//	public int getW() {
//		return w;
//	}
//
//	public void setW(int w) {
//		this.w = w;
//	}
//
//	public int getH() {
//		return h;
//	}
//
//	public void setH(int h) {
//		this.h = h;
//	}
	

}
