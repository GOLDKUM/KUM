//2020/12/21/Kyoung-yong,Kum
package com.lec.ex1_runnable;

public class TargetExTestMain {
	public static void main(String[] args) {
		Runnable target01 = new TargetEx01();
		Runnable target02 = new TargetEx02();

		Thread threadA = new Thread(target01, "A");

		Thread threadB = new Thread(target02, "B");

		threadA.start();
		threadB.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("나는 메인 thread" + Thread.currentThread().getName());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

	}

}
