//2020.12.16 ,yong-kyoung, kum
package com.lec.ex5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Book implements ILendable {
	private String bookNo;
	private String bookTitle;
	private String writer;
	private String borrower;
	private Date checkOutDate;
	private Date checkIn;
	private byte state;

	public Book() {
	}

	public Book(String bookNo, String bookTitle, String writer) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public String toString() {

//		String temp = "\""+bookTitle+"("+bookNo+")\""+writer+"著";

		String temp = "\"" + bookTitle + "(" + bookNo + ")\" " + writer + "著 ";
		if (state == STATE_NORMAL) {
			temp += "대출가능";
		} else if (state == STATE_BORROWED) {
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd E요일");
			temp += "대출(" + sdf.format(checkOutDate) + ") 중";
		} else {
			temp += " 유령상태";
		}

		return temp;
	}

	@Override
	public void checkOut(String borrower) throws Exception {
		if (state != STATE_NORMAL) {
			throw new Exception("대출중인 도서입니다");
		}
		this.borrower = borrower;
		checkOutDate = new Date();
		state = STATE_BORROWED;
		SimpleDateFormat fff = new SimpleDateFormat("Y년 M월 d일 (E) a h시 m분");
		System.out.println("\"" + bookTitle + "\"도서가 ★대출★되었습니다");
		System.out.println("[대출인]" + borrower);
		System.out.println("[대출일]" + fff.format(checkOutDate));
	}

	@Override
	public void checkIn() throws Exception {
		if (state != STATE_BORROWED) {
			throw new Exception(bookTitle + " 도서는 대출중이 아닙니다");
		}

		checkIn = new Date();
		long diff = checkOutDate.getTime() - checkIn.getTime();
		long day = diff / (1000 * 60 * 60 * 24);

		if (day > 14) {
			day = day - 14;
			System.out.print("연체료" + (day * 3000) + "원을 받으셨나요?(Y/N)");
			Scanner scanner = new Scanner(System.in);
			String AA = scanner.next();
			if (!AA.equalsIgnoreCase("y")) {// !가 거짓이면
				System.out.println("연체료를 내셔야 반납처리 가능합니다");
				return;
			}
		}
		borrower = null;
		checkOutDate = null;
		state = STATE_NORMAL;
		System.out.println("\"" + bookTitle + "\"도서가 반납되었습니다");
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

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public byte getState() {
		return state;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public void setState(byte state) {
		this.state = state;
	}

}
