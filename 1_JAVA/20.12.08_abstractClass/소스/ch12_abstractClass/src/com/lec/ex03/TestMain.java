package com.lec.ex03;

public class TestMain {
	public static void main(String[] args) {
//		SuperClass super = new SuperClass();
//		ChildClass child = new ChildClass();
		
		SuperClass sup = new GrandChildClass();
		sup.method1();
		sup.method2();
		//sup.method3();안됨
		System.out.println("==================");
		ChildClass child = new GrandChildClass();
		child.method1();
		child.method2();
		child.method3();
		System.out.println("==================");
		GrandChildClass grand= new GrandChildClass();
		grand.method1();
		grand.method2();
		grand.method3();
	}
	//SuperClass- 추상method1(), method2()
	//ChildClass- 추상method1(), method2(), method3()
	//GrandClass- Override method1(), method2(), method3()
}

