//2020.12.16 ,yong-kyoung, kum tryCatch예제
package com.lec.ex5;

import java.util.Date;
import java.util.GregorianCalendar;

public class TestMain {
	public static void main(String[] args) {
		Book book = new Book("890ㄱ-01", "java", "홍길동");
		Book book1 = new Book("890ㄱ-02", "jooo", "금길동");
		try {
			book.checkOut("kim");
			book1.checkOut("lee");

			book.setCheckOutDate(new Date(new GregorianCalendar(2020, 10, 30).getTimeInMillis()));
			book.checkIn();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // try
		System.out.println(book);
		System.out.println(book1);
	}// main
}
