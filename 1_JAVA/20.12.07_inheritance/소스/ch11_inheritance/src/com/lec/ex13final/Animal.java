package com.lec.ex13final;
/*
 * ���ó�¥,
 */
public class Animal {
	protected int speed;
	public void running() {
//		final int temp=10;
//	temp +=423; ���� final�� �����߱⶧���� ������ �Ұ��ϴ� 
		speed +=5;
		System.out.println("�ٰ� �־��. ����ӵ�:"+speed);
	}
	public final void stop() {
		speed=0;
		System.out.println("����");
	}
	
	
	

}
