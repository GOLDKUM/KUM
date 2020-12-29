//2020/12/21/Kyoung-yong,Kum
package com.lec.ex6_account;

public class Account {
	private int balance;

	public Account() {
	}

	public Account(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(int amount, String who) {
		System.out.println(who + "가 입금시작~ ~ ~");
		System.out.println("입금전 잔액 :" + balance);
		balance += amount;
		System.out.println(amount + "원 입금 후 잔액" + balance);
		System.out.println(who + "가 입금끝~ ~ ~");
	}

	public synchronized void withdrwa(int amount, String who) {
		System.out.println(who + "가 출금시작~ ~ ~");
		System.out.println("출금전 잔액" + balance);
		if (balance < amount) {
			System.out.println("잔액부족으로 출금 할 수 없습니다");
		} else {
			balance -= amount;
			System.out.println(amount + "원 출금 후 잔액" + balance);
		}
		System.out.println(who + "가 출금끝~ ~ ~");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
