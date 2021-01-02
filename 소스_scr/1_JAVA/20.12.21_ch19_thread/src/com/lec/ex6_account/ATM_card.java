//2020/12/21/Kyoung-yong,Kum
package com.lec.ex6_account;

public class ATM_card implements Runnable {
	private boolean flag = false;
	private Account obj;

	public ATM_card(Account obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (flag) {
				obj.withdrwa(1000, Thread.currentThread().getName());
				flag = false;
			} else {
				obj.deposit(1000, Thread.currentThread().getName());
				flag = true;
			} // if
		} // for

	}// run

}// class
