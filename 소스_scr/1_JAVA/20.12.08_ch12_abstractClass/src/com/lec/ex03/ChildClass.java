package com.lec.ex03;

public abstract class ChildClass extends SuperClass{ //�������̵� �ϵ��� ���� �߻�Ŭ������ �������!~
	//SuperClass�κ��� ���� �߻� �޼ҵ� method1()
//	@Override
//	public void method1() {
//		// TODO Auto-generated method stub
//		
//	} �̰� �ۼ��ϵ��� �ƴϸ� abstract �߻����� �ϵ���~!
	@Override
	public void method2() {
		System.out.println("ChildClass�� method2()");
	}
	public void method3() {
		System.out.println("ChildClass�� method3()");
	}
}

//	public SuperClass() {}//������
//	public abstract void method1();// �߻�޼ҵ�
//	public void method2() {
//		System.out.println("Super�� method2()");