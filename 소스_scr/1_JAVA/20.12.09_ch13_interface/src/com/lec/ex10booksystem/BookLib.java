package com.lec.ex10booksystem;

public class BookLib extends BookInfo implements ILendable {
	private String borrower;
	private String checkOutDate;
	private byte state;
	
	public BookLib() {}
	
//	public BookLib(String borrower, String checkoutDate, byte state) {
//		super();
//		this.borrower = borrower;
//		this.checkOutDate = checkoutDate;
//		this.state = state;
//	}
	public BookLib(String bookNo, String bookTitle, String writer) {
		super(bookNo, bookTitle, writer);
//		this.borrower = borrower;
//		this.checkOutDate = checkOutDate;
//		this.state = state;
	}

	@Override
	public void checkOut(String borrow, String checkoutDate) {
		if(state!=STATE_NORMAL) {
			System.out.println("대출중인 도서입니다");
			return ; //?
		}
		this.borrower=borrower;
		this.checkOutDate=checkOutDate;
		state=STATE_BORROWED;
     	System.out.println("\""+getBookTitle()+"\"도서가 대출되었습니다");	
	}

	@Override
	public void checkIn() {
		if(state!=STATE_BORROWED) {
			System.out.println("대출 중인 도서가 아닙니다");
			return;
		}
		borrower=null;
		checkOutDate=null;
		state=STATE_NORMAL;
		System.out.println("\""+getBookTitle()+"\"도서가 반납되었습니다");
	}

	@Override
	public void printState() {
		if(state==STATE_NORMAL) {
			System.out.printf("%s,%s저 - 대출가능\n",
					getBookTitle(),getWriter());
		}else if(state==STATE_BORROWED) {
			System.out.printf("%s,%s저 - 대출중\n",
					getBookTitle(),getWriter());
		}else {
			System.out.printf("%s,%s-유령 상태입니다\n",getBookTitle(),getWriter());
		}
		
			

	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}
	

}
