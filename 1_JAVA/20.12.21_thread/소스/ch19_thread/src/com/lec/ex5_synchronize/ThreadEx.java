//2020/12/21/Kyoung-yong,Kum
//Thread N개에 작업객체1개-반드시 Runnable사용
package com.lec.ex5_synchronize;

public class ThreadEx implements Runnable {
	private int num;// 공유변수

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
			System.out.println("~~~A진행중~~~~");
			num++;
		}
		System.out.println(threadName + "의 num = " + num);
	}

}
