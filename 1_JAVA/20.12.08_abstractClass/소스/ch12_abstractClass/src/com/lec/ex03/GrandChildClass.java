package com.lec.ex03;

public class GrandChildClass extends ChildClass {
	@Override
	public void method1() {
		System.out.println("GrandChild의 method1()");
	}
	
}

//SuperClass- 추상method1(), method2()
//ChildClass- 추상method1(), method2(), method3()
//GrandClass- Override -method1(), method2(), method3()