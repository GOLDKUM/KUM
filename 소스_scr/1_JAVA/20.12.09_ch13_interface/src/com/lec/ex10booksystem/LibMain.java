package com.lec.ex10booksystem;

import java.util.Scanner;

public class LibMain {
	public static void main(String[] args) {
		BookLib[]books= {new BookLib("0000��001","���","���ѹα�"),
				new BookLib("0000��002","���","�߱�"),
				new BookLib("0000��003","���","�̱�"),
				new BookLib("0000��004","����","�Ϻ�"),
				new BookLib("0000��005","�ູ","�ݰ��"),
				new BookLib("0000��005","���","�ڹٿ�")};
		
		Scanner sc = new Scanner(System.in);
		int fn,idx=0;
		String bTitle,borrower,checkOutDate;
		do {
			System.out.print("1:����\t |2:�ݳ�\t |3:������Ȳ\t |0:����");
			fn=sc.nextInt();
			switch(fn) {
			case 1:
				System.out.println("���� �Ͻ� å�̸��� ��� �˴ϱ�?");
				bTitle=sc.next();
				for(idx=0; idx<books.length;idx++) {
					if(bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					} //if
				}//for
				if(idx==books.length) {
					System.out.println("�˼��մϴ� \n �ش� ������ �̵������� �����ϴ�");
				}
				else if (books[idx].getState()==ILendable.STATE_BORROWED) {
					System.out.println("����"+bTitle+"������ �������Դϴ�.");
				}
				else {
					System.out.print("������ ������ ��� �ǽó���?");
					borrower=sc.next();
					System.out.print("�����Ͻô� ��¥�� ��� �ǽó���");
					checkOutDate=sc.next();
					books[idx].checkOut(borrower,checkOutDate);
				}
				break;
			
			case 2:
				System.out.print("�ݳ��Ͻ� å�̸��� ��� �ǽʴϱ�?");
				bTitle=sc.next();
				for(idx=0; idx<books.length;idx++) {
					if(bTitle.equalsIgnoreCase(books[idx].getBookTitle())) {
						break;
					}
				}//for
				if(idx==books.length) {
					System.out.println("�ش絵���� �� �������� å�� �ƴմϴ�");
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
		System.out.println("�ý��� ����");

	}

}
