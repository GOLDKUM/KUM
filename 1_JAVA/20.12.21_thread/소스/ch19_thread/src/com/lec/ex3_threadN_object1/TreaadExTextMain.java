//2020/12/21/Kyoung-yong,Kum
package com.lec.ex3_threadN_object1;

public class TreaadExTextMain {
	public static void main(String[] args) {
		//�ۺ�����ä 1�� ������ ����
		Runnable target = new ThreadEx();
		Thread t1 = new Thread(target, "A");
		Thread t2 = new Thread(target, "B");
		t2.start();
		t1.start();
//		t2.start();
		System.out.println("main �Լ� ��");
		//������� ���� ����� ���� num�� ���� �����Ѵ�! 
		
	}

}
