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

//		String temp = "\""+bookTitle+"("+bookNo+")\""+writer+"��";

		String temp = "\"" + bookTitle + "(" + bookNo + ")\" " + writer + "�� ";
		if (state == STATE_NORMAL) {
			temp += "���Ⱑ��";
		} else if (state == STATE_BORROWED) {
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd E����");
			temp += "����(" + sdf.format(checkOutDate) + ") ��";
		} else {
			temp += " ���ɻ���";
		}

		return temp;
	}

	@Override
	public void checkOut(String borrower) throws Exception {
		if (state != STATE_NORMAL) {
			throw new Exception("�������� �����Դϴ�");
		}
		this.borrower = borrower;
		checkOutDate = new Date();
		state = STATE_BORROWED;
		SimpleDateFormat fff = new SimpleDateFormat("Y�� M�� d�� (E) a h�� m��");
		System.out.println("\"" + bookTitle + "\"������ �ڴ���ڵǾ����ϴ�");
		System.out.println("[������]" + borrower);
		System.out.println("[������]" + fff.format(checkOutDate));
	}

	@Override
	public void checkIn() throws Exception {
		if (state != STATE_BORROWED) {
			throw new Exception(bookTitle + " ������ �������� �ƴմϴ�");
		}

		checkIn = new Date();
		long diff = checkOutDate.getTime() - checkIn.getTime();
		long day = diff / (1000 * 60 * 60 * 24);

		if (day > 14) {
			day = day - 14;
			System.out.print("��ü��" + (day * 3000) + "���� �����̳���?(Y/N)");
			Scanner scanner = new Scanner(System.in);
			String AA = scanner.next();
			if (!AA.equalsIgnoreCase("y")) {// !�� �����̸�
				System.out.println("��ü�Ḧ ���ž� �ݳ�ó�� �����մϴ�");
				return;
			}
		}
		borrower = null;
		checkOutDate = null;
		state = STATE_NORMAL;
		System.out.println("\"" + bookTitle + "\"������ �ݳ��Ǿ����ϴ�");
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
