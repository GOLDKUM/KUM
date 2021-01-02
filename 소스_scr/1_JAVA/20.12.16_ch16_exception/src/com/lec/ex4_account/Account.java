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
		System.out.println("������:" + this);
		balance += amount;
		System.out.println(amount + "������:" + this);
	}

	public void withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception(amount + "�� ����ϱ⿡�� �ܾ�(" + balance + ")�� �����մϴ�");// ���ξȿ� ���� �޼����� �ۼ��ϸ��
		}
		System.out.println("�����: " + this);
		balance -= amount;
		System.out.println(amount + "�� �����:" + this);
	}

	@Override
	public String toString() {
		String result = "���¹�ȣ:" + accountNo + "\t������:" + ownerName;
		result += "\t:" + balance;
		return result;
	}

}
