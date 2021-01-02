package com.lec.ex03;

public abstract class ChildClass extends SuperClass{ //오버라이드 하든지 나를 추상클래스로 만들던지!~
	//SuperClass로부터 받은 추상 메소드 method1()
//	@Override
//	public void method1() {
//		// TODO Auto-generated method stub
//		
//	} 이거 작성하든지 아니면 abstract 추상으로 하든지~!
	@Override
	public void method2() {
		System.out.println("ChildClass의 method2()");
	}
	public void method3() {
		System.out.println("ChildClass의 method3()");
	}
}

//	public SuperClass() {}//생성자
//	public abstract void method1();// 추상메소드
//	public void method2() {
//		System.out.println("Super의 method2()");