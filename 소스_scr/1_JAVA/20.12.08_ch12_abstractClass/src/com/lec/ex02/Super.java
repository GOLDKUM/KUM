package com.lec.ex02;
// �߻�Ŭ������ �Ѱ��̻��� �߻�޼ҵ鸣 ��
// Super s = new Super();
// s. method1(); �߻�Ŭ������ ��ü�� ������� ���� !! 
public abstract class Super {
	public Super() {} // ����Ʈ ������ 
	public abstract void method1();// �߻�޼ҵ�  �̸��� ������ ȣ���Ҽ� ���� why �׳ɼ��� �Ѱ���
	public void method2() {
		System.out.println("Super�� method2()");
	}
	
	

}
