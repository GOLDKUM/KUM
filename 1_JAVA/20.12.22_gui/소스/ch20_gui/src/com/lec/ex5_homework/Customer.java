package com.lec.ex5_homework;

public class Customer {
	private String phone;
	private String name;
	private int point;
	public Customer(String phone, String name, int point) {
		this.phone = phone;
		this.name = name;
		this.point = point;
	}
	@Override
	public String toString() {
		return name+"("+phone+")핸드폰 번호 : " + point;
	}
	public String getPhone() {return phone;}
	public String getName() {return name;}
	public int getPoint() { return point;}
}