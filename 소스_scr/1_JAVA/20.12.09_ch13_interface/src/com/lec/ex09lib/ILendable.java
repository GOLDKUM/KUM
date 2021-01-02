package com.lec.ex09lib;
public interface ILendable {
	public byte STATE_BORROWED=1;//대출중   
	public byte STATE_NORMAL  =0;//대출가능

	public void checkOut(String borrow,String checkoutDate);//대출로직
	public void checkIn(); //반납
	public void printState();//"자바" 홍길동저 대출가능
						    //"자바" 홍길동저 대출중
	
	
}
