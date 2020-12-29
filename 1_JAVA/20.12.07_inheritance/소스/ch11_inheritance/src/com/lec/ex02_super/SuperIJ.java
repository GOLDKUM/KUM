package com.lec.ex02_super;
public class SuperIJ {
	private int i;
	private int j;
	public SuperIJ() {
		System.out.println("매개변수 없는 거");
	}
	public SuperIJ(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("매개변수 있는 거");
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
}
