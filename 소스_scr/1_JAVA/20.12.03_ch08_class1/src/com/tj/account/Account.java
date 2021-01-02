package com.tj.account;

/* 은행계좌클래스 
 * 데이터(private) 계좌번호(accountNo:String)숫자이름으로 String
 * 				   예금주  (ownerName:String)
 * 				   잔액     (balance:int(long)) 
 * 
 * 메소드(public): 예금하다(void deposit (int money))   new Account("110-352","홍",10)
 * 				  인출한다(void withdraw(int money))    new Account("110-352","홍")
 * 	                                                   	여기위에 생성자 이런형식임
 * 데이터 생성자 메소드 get set     순서				
 *
 */
public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;  //why private으로 일단 데이터를  선언하고 
	//데이터
	public Account() {}
	public Account(String accountNo, String ownerName){
		this.accountNo = accountNo;
		this.ownerName = ownerName;  //private으로 선언을 했으면 public으로 돌려야 데이터가 공유가 되겠죠 ?
									 //private와 public을 서로 연동시키려면  데이터2번째의 것을 해줘야함!
		
	}
	public Account(String accountNo, String ownerName,int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance= balance;
	}//생성자
	public void deposit(int money) { //예금은 무조건 
		balance+=money;
	}
	public void withdraw(int money) { // 잔액 부족시 "떼기"출력
		if (balance >=money) {
			balance-=money;//balance = balance -money;
		}else {
			System.out.println("잔액부족. 떼끼");
		}
		
	}
	public void info() {
		System.out.println("계좌번호:"+accountNo+","+ownerName+"님 잔액은"+balance);
	}//메소드
	
	//accountNo,ownerName,balacne setter&getter
	
	public void setAccountNo(String accountNo) {
		this.accountNo=accountNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setBalance(int balacne) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}

	
	
}

