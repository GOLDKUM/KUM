package com.lec.ex13final;
//final Ŭ����: ��ӺҰ� 
public final class Dog extends Animal {
	@Override
	public void running() {
		speed+=10;
		System.out.println("�������� �ٸ鼭 ������ �����. ���ӵ�:"+speed);
	}
	//���� stop �տ� final�� �ֱ⋚���� �������̵尡 ���� ���� 
	public void method() {
		System.out.println("method()");
	}
}
