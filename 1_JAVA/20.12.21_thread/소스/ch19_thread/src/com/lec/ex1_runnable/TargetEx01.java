//2020/12/21/Kyoung-yong,Kum
package com.lec.ex1_runnable;

public class TargetEx01 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요-" + i);
			try {
				Thread.sleep(500);// 0.5초동안 대기상태
			} catch (InterruptedException e) {
			}
		}

	}

}
