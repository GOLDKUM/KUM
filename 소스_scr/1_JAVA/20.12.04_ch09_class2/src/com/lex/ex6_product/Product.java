package com.lex.ex6_product;
//Product p1 = new Product();
public class Product {
	private int serialNo;//��ü ������ ��ȣ
	public static int count = 100;
	public Product() {
		serialNo=++count;
	}
	public void infoString() {
		System.out.println("serialNo="+serialNo+
					 "�������� count ="+count);
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	
	public int getSerialNo() {
		return serialNo;
	}
}
