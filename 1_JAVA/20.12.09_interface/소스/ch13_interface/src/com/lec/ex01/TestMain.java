package com.lec.ex01;

public class TestMain {
	public static void main(String[] args) {
//		InterfaceEx1 ex01 = new InterfaceEx1();
//		InterfaceEx1 ex01 = new InterfaceEx2();
		InterfaceClass obj1 = new InterfaceClass();
		obj1.method1();
		obj1.method2();
		
		InterfaceEx01 obj2 = new InterfaceClass();
		obj2.method1();
//		obj2.method2(); /불가(InterfaceEx01엔 method2()가 없음)
		InterfaceEx02 obj3 = new InterfaceClass();
		if(obj3 instanceof InterfaceClass) {
		((InterfaceClass)obj3).method1();//타입을 마춘다 진짜 어렵다 아이고...
		}
		//obj3,method1();불가~!
		obj3.method2();
	}

}
