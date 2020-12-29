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
		System.out.println(who + "�� �Աݽ���~ ~ ~");
		System.out.println("�Ա��� �ܾ� :" + balance);
		balance += amount;
		System.out.println(amount + "�� �Ա� �� �ܾ�" + balance);
		System.out.println(who + "�� �Աݳ�~ ~ ~");
	}

	public synchronized void withdrwa(int amount, String who) {
		System.out.println(who + "�� ��ݽ���~ ~ ~");
		System.out.println("����� �ܾ�" + balance);
		if (balance < amount) {
			System.out.println("�ܾ׺������� ��� �� �� �����ϴ�");
		} else {
			balance -= amount;
			System.out.println(amount + "�� ��� �� �ܾ�" + balance);
		}
		System.out.println(who + "�� ��ݳ�~ ~ ~");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
