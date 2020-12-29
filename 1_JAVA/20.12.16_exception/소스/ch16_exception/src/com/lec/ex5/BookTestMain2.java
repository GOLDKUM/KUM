//2020.12.16 ,yong-kyoung, kum tryCatch����
package com.lec.ex5;

import java.util.Scanner;

public class BookTestMain2 {
	public static void main(String[] args) throws Exception {
		Book[] books = { new Book("890��-01", "java", "ȫ�浿"), new Book("890��-02", "jooo", "�ݱ浿") };

		Scanner sc = new Scanner(System.in);
		int fn, idx = 0;
		String bTitle, borrower;
		do {
			System.out.print("1:����\t |2:�ݳ�\t |3: ����|0:��������");
			fn = sc.nextInt();
			switch (fn) {
			case 0:
				for (Book book : books) {
					System.out.println(book);
				}
			case 1:
				System.out.println("���� �Ͻ� å�̸��� ��� �˴ϱ�?");
				bTitle = sc.next();
				for (idx = 0; idx < books.length; idx++) {
					if (bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					} // if
				} // for
				System.out.println("\n\n idx : " + idx + "\n\n");
				if (idx == books.length) {
					System.out.println("�˼��մϴ� \n �ش� ������ �̵������� �����ϴ�");
				} else if (books[idx].getState() == ILendable.STATE_BORROWED) {
					System.out.println("����" + bTitle + "������ �������Դϴ�.");
				} else {
					System.out.print("������ ������ ��� �ǽó���?");
					borrower = sc.next();
					try {
						books[idx].checkOut(borrower);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 2:
				System.out.print("�ݳ��Ͻ� å�̸��� ��� �ǽʴϱ�?");
				bTitle = sc.next();
				for (idx = 0; idx < books.length; idx++) {
					if (bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					}
				} // for
				if (idx == books.length) {
					System.out.println("�ش絵���� �� �������� å�� �ƴմϴ�");
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
		System.out.println("�ý��� ����");
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
