package com.lec.ex02;

public class Child extends Super {//추상 method1(),method2()

	@Override
	public void method1() {
		System.out.println("Child의 method1()-추상메소드라 꼭 오버라이드");
	}
	public void method3() {
		System.out.println("Child의 method3()");
	}
	

}
