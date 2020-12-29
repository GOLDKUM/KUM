package com.lec.ex4_homework;

public class Customer {
	private String tel;
	private String name;
	private int point;
	
	public Customer() {}
	public Customer(String tel, String name, int point) {
		super();
		this.tel = tel;
		this.name = name;
		this.point = point;
	}
	@Override
	public String toString() {
		return "[Tel]="+tel+"[Name]="+name+"[Point]="+point;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	

}
