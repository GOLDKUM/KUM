package com.tj.account;

/* �������Ŭ���� 
 * ������(private) ���¹�ȣ(accountNo:String)�����̸����� String
 * 				   ������  (ownerName:String)
 * 				   �ܾ�     (balance:int(long)) 
 * 
 * �޼ҵ�(public): �����ϴ�(void deposit (int money))   new Account("110-352","ȫ",10)
 * 				  �����Ѵ�(void withdraw(int money))    new Account("110-352","ȫ")
 * 	                                                   	�������� ������ �̷�������
 * ������ ������ �޼ҵ� get set     ����				
 *
 */
public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;  //why private���� �ϴ� �����͸�  �����ϰ� 
	//������
	public Account() {}
	public Account(String accountNo, String ownerName){
		this.accountNo = accountNo;
		this.ownerName = ownerName;  //private���� ������ ������ public���� ������ �����Ͱ� ������ �ǰ��� ?
									 //private�� public�� ���� ������Ű����  ������2��°�� ���� �������!
		
	}
	public Account(String accountNo, String ownerName,int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance= balance;
	}//������
	public void deposit(int money) { //������ ������ 
		balance+=money;
	}
	public void withdraw(int money) { // �ܾ� ������ "����"���
		if (balance >=money) {
			balance-=money;//balance = balance -money;
		}else {
			System.out.println("�ܾ׺���. ����");
		}
		
	}
	public void info() {
		System.out.println("���¹�ȣ:"+accountNo+","+ownerName+"�� �ܾ���"+balance);
	}//�޼ҵ�
	
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

