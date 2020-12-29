package com.lec.ex10booksystem;

import java.util.Scanner;

public class LibMain {
	public static void main(String[] args) {
		BookLib[]books= {new BookLib("0000ㄱ001","희망","대한민국"),
				new BookLib("0000ㄱ002","용기","중국"),
				new BookLib("0000ㄱ003","재미","미국"),
				new BookLib("0000ㄱ004","성실","일본"),
				new BookLib("0000ㄱ005","행복","금경용"),
				new BookLib("0000ㄱ005","기쁨","자바용")};
		
		Scanner sc = new Scanner(System.in);
		int fn,idx=0;
		String bTitle,borrower,checkOutDate;
		do {
			System.out.print("1:대출\t |2:반납\t |3:도서현황\t |0:종료");
			fn=sc.nextInt();
			switch(fn) {
			case 1:
				System.out.println("대출 하실 책이름은 어떻게 됩니까?");
				bTitle=sc.next();
				for(idx=0; idx<books.length;idx++) {
					if(bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					} //if
				}//for
				if(idx==books.length) {
					System.out.println("죄송합니다 \n 해당 도서는 이도서관에 없습니다");
				}
				else if (books[idx].getState()==ILendable.STATE_BORROWED) {
					System.out.println("현재"+bTitle+"도서는 대출중입니다.");
				}
				else {
					System.out.print("대출인 성함은 어떻게 되시나요?");
					borrower=sc.next();
					System.out.print("대출하시는 날짜는 어떻게 되시나요");
					checkOutDate=sc.next();
					books[idx].checkOut(borrower,checkOutDate);
				}
				break;
			
			case 2:
				System.out.print("반납하실 책이름은 어떻게 되십니까?");
				bTitle=sc.next();
				for(idx=0; idx<books.length;idx++) {
					if(bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					}
				}//for
				if(idx==books.length) {
					System.out.println("해당도서는 본 도서관의 책이 아닙니다");
				}else {
					books[idx].checkIn();
				}
				break;
			
			case 3:
				for(BookLib book : books) {
					book.printState();
				}
				
			}
		}while(fn!=0);
		System.out.println("시스템 종료");

	}

}
