package com.lec.ex05_override;
public class ParentClass {
	// 생성자가 2개 : 생성자함수의 오버로딩overloading(함수의 중복정의)
	public ParentClass() {System.out.println("P 매개변수 없는 생성자");}
	public ParentClass(int i) {System.out.println("P 매개변수 있는 생성자");}
	public void method1() {System.out.println("Parent의 method1()");}
	public void method2() {System.out.println("Parent의 method2()");}
}
