//2020.12.16 ,yong-kyoung, kum
package com.lec.ex4_account;

public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;

	public Account() {
	}

	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(int amount) {
		System.out.println("예금전:" + this);
		balance += amount;
		System.out.println(amount + "예금후:" + this);
	}

	public void withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception(amount + "원 출금하기에는 잔액(" + balance + ")이 부족합니다");// 가로안에 예외 메세지를 작성하면됨
		}
		System.out.println("출금전: " + this);
		balance -= amount;
		System.out.println(amount + "원 출금후:" + this);
	}

	@Override
	public String toString() {
		String result = "계좌번호:" + accountNo + "\t예금주:" + ownerName;
		result += "\t:" + balance;
		return result;
	}

}
