//2020/12/21/Kyoung-yong,Kum
package com.lec.ex4_threadN_objectN;

public class ThreadEx2 extends Thread {
	private int num;// 공유변수

	public ThreadEx2() {super();}
	public ThreadEx2(String name) {
		setName(name);
	}

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

		} // for

	}// run

}
