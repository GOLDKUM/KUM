package com.lec.ex08;
//()�޼ҵ��� 
public class HourlyEmployee extends Employee {
	private int hourWorked; // �Ѵ޵��� ���� �ð� 
	private int moneyPerHour;//�ð��� ���� 
	
	public HourlyEmployee(String name,int hourWorked,int moneyPerHour) {
		super(name);
		this.hourWorked=hourWorked;
		this.moneyPerHour=moneyPerHour;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return hourWorked*moneyPerHour;
	}

	public int getHourWorked() {
		return hourWorked;
	}

	public void setHourWorked(int hourWorked) {
		this.hourWorked = hourWorked;
	}

	public int getMoneyPerHour() {
		return moneyPerHour;
	}

	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}
	

}
