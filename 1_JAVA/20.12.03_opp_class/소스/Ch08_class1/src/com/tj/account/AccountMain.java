package com.tj.account;

public class AccountMain {
	public static void main(String[] args) {
		Account hong = new Account ("110-1","È«±æµ¿",10000);
		Account hong1 = new Account ("110-2","È«ÀÏ");
		Account hong2 = new Account();
		hong2.setAccountNo("110-9");
		hong2.setOwnerName("½Å±æµ¿");
		hong.deposit(10000);
		hong.info();
		hong1.withdraw(1);
   		hong1.info();
		hong2.deposit(10000);
		hong2.withdraw(2000);
		hong2.info();
	}

}
