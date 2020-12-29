package com.lec.ex10booksystem;

public interface ILendable {
	public byte STATE_BORROWED=1;
	public byte STATE_NORMAL  =0;
	
	public void checkOut(String borrow,String checkoutDate);
	public void checkIn();
	public void printState();
	

}
