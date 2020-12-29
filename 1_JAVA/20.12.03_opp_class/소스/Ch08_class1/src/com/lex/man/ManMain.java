package com.lex.man;

public class ManMain {
	public static void main(String[] args) {
		Man kim = new Man(20, 170, 60, "010-9999-9999");
		Man yi = new Man(20, 170, 60);
		Man kang = new Man(20, 170, 60);
		Man[] student = { kim, yi, kang };
		//		int [] iArr = {10,20,30}
		//  String[] names= {"홍길동","김길동","금경용"}
		// 밑에부분은 데이터를 바꾸는 초기화하는 과정 
		yi.setTel("010-8888-8888");
		kang.setHeight(180);
		kang.setWeight(65);
		double biman = kim.calculateBMI();
		if(biman>24)
		{
			System.out.println("kim은 비만이니 건강조심");
		}else {
			System.out.println("kim은 다이어트 금지");
		}
		biman = yi.calculateBMI();
		System.out.println(biman>24? "건강조심다이어트":"다이어트 금지");
		biman = kang.calculateBMI();
		System.out.println(biman>24? "건강조심다이어트":"다이어트 금지");
	}
}
