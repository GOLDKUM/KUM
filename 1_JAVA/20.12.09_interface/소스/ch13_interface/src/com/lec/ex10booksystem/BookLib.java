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
			System.out.println("�������� �����Դϴ�");
			return ; //?
		}
		this.borrower=borrower;
		this.checkOutDate=checkOutDate;
		state=STATE_BORROWED;
     	System.out.println("\""+getBookTitle()+"\"������ ����Ǿ����ϴ�");	
	}

	@Override
	public void checkIn() {
		if(state!=STATE_BORROWED) {
			System.out.println("���� ���� ������ �ƴմϴ�");
			return;
		}
		borrower=null;
		checkOutDate=null;
		state=STATE_NORMAL;
		System.out.println("\""+getBookTitle()+"\"������ �ݳ��Ǿ����ϴ�");
	}

	@Override
	public void printState() {
		if(state==STATE_NORMAL) {
			System.out.printf("%s,%s�� - ���Ⱑ��\n",
					getBookTitle(),getWriter());
		}else if(state==STATE_BORROWED) {
			System.out.printf("%s,%s�� - ������\n",
					getBookTitle(),getWriter());
		}else {
			System.out.printf("%s,%s-���� �����Դϴ�\n",getBookTitle(),getWriter());
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
