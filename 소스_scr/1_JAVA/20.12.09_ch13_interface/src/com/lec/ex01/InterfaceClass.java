package com.lec.ex01;
//interface
public class InterfaceClass implements InterfaceEx01,InterfaceEx02 {

	@Override
	public void method1() {
		System.out.println("실제 구현은 implements한 클래스에서 해요");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String method2() {
		System.out.println("실제 구현은 implements한 클래스에서 해요");
		return null;
	}

}
