//2020/12/21/Kyoung-yong,Kum
package com.lec.ex1_runnable;

public class Target implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread Target");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "ÀÇ i=" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}

}
