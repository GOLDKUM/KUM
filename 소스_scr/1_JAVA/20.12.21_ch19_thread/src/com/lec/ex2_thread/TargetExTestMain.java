//2020/12/21/Kyoung-yong,Kum
package com.lec.ex2_thread;

public class TargetExTestMain {
	public static void main(String[] args) {
		//������ ���� -target01.run()�� ���� 
		Thread target01 = new TargetEx01();//�Ű����������� �Ҽ�����.
		target01.setName("A");
		
		//������ ���� -target02.run()�� ���� 
		Thread target02 = new TargetEx02();
		target02.setName("B");
		target01.start();
		target02.start();
		for(int i=0;i<10;i++) {
			System.out.println("����"+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		
	}

}
