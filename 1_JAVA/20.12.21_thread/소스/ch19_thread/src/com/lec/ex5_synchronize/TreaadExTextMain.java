//2020/12/21/Kyoung-yong,Kum
package com.lec.ex5_synchronize;

public class TreaadExTextMain {
	public static void main(String[] args) {
		Runnable target = new ThreadEx();
		Thread t1 = new Thread(target, "A");
		Thread t2 = new Thread(target, "B");
		t1.start();
		t2.start();
		System.out.println("main ÇÔ¼ö ³¡");

	}

}
