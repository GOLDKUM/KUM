package com.lec.ex09lib;

import java.util.Scanner;

public class LibMain {
	public static void main(String[] args) {
		Book[]books = {new Book("890ㄱ-100","java","아무개"),
                       new Book("890ㄱ-101","hadoop","저무개")	,
                       new Book("890ㄱ-102","oracle","이무개")	,	
                       new Book("890ㄱ-103","python","김무개")	,	
                       new Book("890ㄱ-104","spark","신무개")};
		Scanner sc = new Scanner(System.in);
		int fn,idx=0;// 기능번호(1:대출,2:반납....,인덱스(books의)
		String bTitle,borrower,checkOutDate;//책제목,대출인,대출일 
		do {
			System.out.print("1:대출|2:반납|3:도서현황|0:종료");
			fn = sc.nextInt();
			switch(fn) {
			case 1:// 책이름- >책조회 -> ((해당책의 상태)생략 앞에부분에서 method만듬) -> ->대출인,대출일->대출
//				System.out.println("대출진행");
				//책이름 입력
				System.out.println("대출할 이름은?");
				bTitle=sc.next();//스트링을 받기위해 next()   숫자는 nextin
				//책조회           4       5
				for(idx=0; idx<books.length ; idx++) {
					if(bTitle.equals(books[idx].getBookTitle())) {
						//찾았다 .해당 idx번쨰 대출하러 가자 
						break;
					}
				}
				// 책조회에서 책을 찾았는지 못찾았는지 보고 대출 진행 
				if(idx==books.length) {
					//못찾음
					System.out.println("해당 도서가 없습니다");
				}else if(books[idx].getState()==ILendable.STATE_BORROWED){
					System.out.println(bTitle+"도서는 대출중입니다");
				
				}else {
					//대출가능이니 대출인, 대출일 입력받고 대출진행 
					System.out.print("대출인?");
					borrower = sc.next();
					System.out.print("대출일은");
					checkOutDate=sc.next();
					books[idx].checkOut(borrower,checkOutDate);
				}//찾음 -idx번쨰것 대출진행
				break;
			
			case 2://책이름 ->책조회-> 반납
//				System.out.println("반납진행");
				System.out.print("반납할 책이름은?");
				bTitle=sc.next();
				for(idx=0;idx<books.length;idx++) {
					if(bTitle.equals(books[idx].getBookTitle())) {
						break;
					}
				}
				if(idx==books.length) {
					System.out.println("해당도서는 본 도서관의 책이 아닙니다");
				}else {
					books[idx].checkIn();
				}
				break;
			
			case 3://for문을 이용해서 도서상태 출력 
//				System.out.println("도서를 상태 출력");	
				for(Book book : books) {
					book.printState();
				}
			}
		}while(fn!=0);
		System.out.println("시스템 종료");
		
	}

}
