package com.lec.ex09lib;

public class Book implements ILendable{
	private String bookNo;//책 청구번호 890ㄱ-102나
	private String bookTitle; //책 제목 ex.자바
	private String writer; //저자
	private String borrower;//대출인
	private String checkOutDate;//대출일(입력
	private byte state;
	//필요한 변수 다씀 이제 다음 고민은 생성자를 어떻게 만들건지 고민해야지
	//new Book("890ㄱ-102나","자바","홍길동")
	
	public Book() {}//디폴트 생성자 
	
	
	public Book(String bookNo, String bookTitle, String writer) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
//		borrower=null; checkOutDate=null;
//		state=STATE_NORMAL;
//		안써도 저절로 이렇게 됨 
	}

	//BOOK b = new Book("890ㄱ-102나","자바","홍길동")
	//b.checkOut("신길동","2201209");
	
	@Override
	public void checkOut(String borrow, String checkoutDate) {
		if(state!=STATE_NORMAL) {
			System.out.println("대출중인 도서입니다");
			return ; //?
		}
//		else{
		//대출처리}
		this.borrower=borrower;
		this.checkOutDate=checkOutDate;
		state=STATE_BORROWED;
		//"자바"도서가 대출되었습니다
		System.out.println("\""+bookTitle+"\"도서가 대출되었습니다");
	}
	//b.checkIn()

	@Override
	public void checkIn() {
		if(state != STATE_BORROWED) {
			System.out.println("대출 중인 도서가 아닙니다");
			return ;
		}
		//반납 처리 로직
		borrower=null;
		checkOutDate=null;
		state=STATE_NORMAL;
		//"자바"도서가 반납처리 되었습니다.
		System.out.println("\""+bookTitle+"\"도서가 반납되었습니다");
		
	}
	//b.printState()->자바,홍길동저-대출가능(대출중)
	
	@Override
	public void printState() {
		if(state == STATE_NORMAL) {
			System.out.printf("%s,%s저 - 대출가능\n",
					bookTitle,writer);
		}else if(state==STATE_BORROWED) {
			System.out.printf("%s,%s저 - 대출중\n",
						bookTitle,writer);
		}else {
			System.out.printf("%s,%s-유령 상태입니다\n",bookTitle,writer);
		}
		
		
//		String msg = bookTitle+","+writer+"-";
//		msg+= state==STATE_NORMAL? "대출가능":"대출중";
//		System.out.println(msg);
		
	}


	public String getBookNo() {
		return bookNo;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public String getWriter() {
		return writer;
	}


	public String getBorrower() {
		return borrower;
	}


	public String getCheckOutDate() {
		return checkOutDate;
	}


	public byte getState() {
		return state;
	}

}
