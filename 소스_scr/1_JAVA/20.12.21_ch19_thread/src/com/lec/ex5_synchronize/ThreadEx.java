//2020/12/21/Kyoung-yong,Kum
//Thread N���� �۾���ü1��-�ݵ�� Runnable���
package com.lec.ex5_synchronize;

public class ThreadEx implements Runnable {
	private int num;// ��������

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			out();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}

		} // for

	}// run

	private synchronized void out() {
		String threadName = Thread.currentThread().getName();
		if (threadName.equals("A")) {
			System.out.println("~~~A������~~~~");
			num++;
		}
		System.out.println(threadName + "�� num = " + num);
	}

}
