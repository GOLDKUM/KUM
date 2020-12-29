//2020/12/21/Kyoung-yong,Kum
package com.lec.ex1_runnable;

public class TargetEx02 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("¹Ý°©½À´Ï´Ù-" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		} // for

	}// run

}
