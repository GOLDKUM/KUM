package com.lec.ex03;

public class GrandChildClass extends ChildClass {
	@Override
	public void method1() {
		System.out.println("GrandChild�� method1()");
	}
	
}

//SuperClass- �߻�method1(), method2()
//ChildClass- �߻�method1(), method2(), method3()
//GrandClass- Override -method1(), method2(), method3()