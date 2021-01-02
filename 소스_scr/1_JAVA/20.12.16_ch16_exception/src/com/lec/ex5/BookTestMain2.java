//2020.12.16 ,yong-kyoung, kum tryCatch예제
package com.lec.ex5;

import java.util.Scanner;

public class BookTestMain2 {
	public static void main(String[] args) throws Exception {
		Book[] books = { new Book("890ㄱ-01", "java", "홍길동"), new Book("890ㄱ-02", "jooo", "금길동") };

		Scanner sc = new Scanner(System.in);
		int fn, idx = 0;
		String bTitle, borrower;
		do {
			System.out.print("1:대출\t |2:반납\t |3: 종료|0:도서상태");
			fn = sc.nextInt();
			switch (fn) {
			case 0:
				for (Book book : books) {
					System.out.println(book);
				}
			case 1:
				System.out.println("대출 하실 책이름은 어떻게 됩니까?");
				bTitle = sc.next();
				for (idx = 0; idx < books.length; idx++) {
					if (bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					} // if
				} // for
				System.out.println("\n\n idx : " + idx + "\n\n");
				if (idx == books.length) {
					System.out.println("죄송합니다 \n 해당 도서는 이도서관에 없습니다");
				} else if (books[idx].getState() == ILendable.STATE_BORROWED) {
					System.out.println("현재" + bTitle + "도서는 대출중입니다.");
				} else {
					System.out.print("대출인 성함은 어떻게 되시나요?");
					borrower = sc.next();
					try {
						books[idx].checkOut(borrower);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 2:
				System.out.print("반납하실 책이름은 어떻게 되십니까?");
				bTitle = sc.next();
				for (idx = 0; idx < books.length; idx++) {
					if (bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					}
				} // for
				if (idx == books.length) {
					System.out.println("해당도서는 본 도서관의 책이 아닙니다");
				} else {
					try {
						books[idx].checkIn();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			}
		} while (fn != 3);
		System.out.println("시스템 종료");
		sc.close();
	}

}

//try {
//	book.checkOut("kim");
//	book1.checkOut("lee");
//	
//}catch(Exception e) {
//	System.out.println(e.getMessage());
//}//try
//System.out.println(book);
//System.out.println(book1);
