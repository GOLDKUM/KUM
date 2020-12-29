//2020/12/21/Kyoung-yong,Kum
package com.lec.ex6_account;

public class ATM_cardThestMain {
	public static void main(String[] args) {
		Account account = new Account(10000);
		ATM_card target = new ATM_card(account);
	
		Thread mom = new Thread(target,"mom");
		Thread dad = new Thread(target,"dad");
		mom.start();
		dad.start();
	}

}
