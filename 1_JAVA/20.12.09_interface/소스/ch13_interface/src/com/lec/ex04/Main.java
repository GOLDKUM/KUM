package com.lec.ex04;

public class Main {
	public static void main(String[] args) {
		TestChildClass test = new TestChildClass();
		System.out.println(test.i1+","+test.i2);
		System.out.println(I1.i1);//클래스 이름으로 해주길 바라는거임 
		System.out.println(test.i3+","+test.i11);
		
		//메소드들 실험 
		test.m1();
		test.m2();
		test.m3();
		test.m11();
		
	}

}
