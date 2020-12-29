//2020/12/21/Kyoung-yong,Kum
package com.lec.ex3_threadN_object1;

public class ThreadEx implements Runnable {
	private int num;// 공유변수

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String threadName = Thread.currentThread().getName();
			if (threadName.equals("A")) {
				System.out.println("~~~A진행중~~~~");
				num++;
			}
			System.out.println(threadName + "의 num = " + num);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}

		}//for

	}//run

}
