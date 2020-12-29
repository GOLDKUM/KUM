//2020-12-15 ⒦금경용
package com.lec.ex4_Object;
//tel,name,point,amount
public class Customer {
	private String tel;
	private String name;
	private int point;
	private int amount;
	
	public Customer() {}
	
	
	public Customer(String tel, String name) {
		this.tel = tel;
		this.name = name;
	}
	public Customer(String tel, String name, int point) {	
		this.tel = tel;
		this.name = name;
		this.point = point;
		
	}
	@Override
	public String toString() {
		this.point=500;
		this.amount=0;
		return "[전화번호]"+tel+"[이름]"+name+"[포인트]"+point+"[누적금액]"+amount;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Customer) {
			return tel.equals(((Customer)obj).tel);
		}
		return false;
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


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	

}
