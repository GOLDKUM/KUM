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
//		obj2.method2(); /�Ұ�(InterfaceEx01�� method2()�� ����)
		InterfaceEx02 obj3 = new InterfaceClass();
		if(obj3 instanceof InterfaceClass) {
		((InterfaceClass)obj3).method1();//Ÿ���� ����� ��¥ ��ƴ� ���̰�...
		}
		//obj3,method1();�Ұ�~!
		obj3.method2();
	}

}
