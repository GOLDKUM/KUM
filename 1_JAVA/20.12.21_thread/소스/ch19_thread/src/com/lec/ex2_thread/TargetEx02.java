//2020/12/21/Kyoung-yong,Kum
package com.lec.ex2_thread;

public class TargetEx02 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�ݰ����ϴ�-"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}
	

}
