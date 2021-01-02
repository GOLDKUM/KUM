package com.lec.ex08;

public abstract class SalaryEmployee extends Employee {
	private int annalSalary;
	

	public SalaryEmployee(String name,int annalSalary) {
		super(name);
		this.annalSalary =annalSalary;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int computePay() {
		
		return annalSalary / 14;
	}

	public int getAnnalSalary() {
		return annalSalary;
	}

	public void setAnnalSalary(int annalSalary) {
		this.annalSalary = annalSalary;
	}
	

}
