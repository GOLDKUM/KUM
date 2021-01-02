package com.lec.ex09lib;

import java.util.Scanner;

public class LibMain {
	public static void main(String[] args) {
		Book[]books = {new Book("890��-100","java","�ƹ���"),
                       new Book("890��-101","hadoop","������")	,
                       new Book("890��-102","oracle","�̹���")	,	
                       new Book("890��-103","python","�蹫��")	,	
                       new Book("890��-104","spark","�Ź���")};
		Scanner sc = new Scanner(System.in);
		int fn,idx=0;// ��ɹ�ȣ(1:����,2:�ݳ�....,�ε���(books��)
		String bTitle,borrower,checkOutDate;//å����,������,������ 
		do {
			System.out.print("1:����|2:�ݳ�|3:������Ȳ|0:����");
			fn = sc.nextInt();
			switch(fn) {
			case 1:// å�̸�- >å��ȸ -> ((�ش�å�� ����)���� �տ��κп��� method����) -> ->������,������->����
//				System.out.println("��������");
				//å�̸� �Է�
				System.out.println("������ �̸���?");
				bTitle=sc.next();//��Ʈ���� �ޱ����� next()   ���ڴ� nextin
				//å��ȸ           4       5
				for(idx=0; idx<books.length ; idx++) {
					if(bTitle.equals(books[idx].getBookTitle())) {
						//ã�Ҵ� .�ش� idx���� �����Ϸ� ���� 
						break;
					}
				}
				// å��ȸ���� å�� ã�Ҵ��� ��ã�Ҵ��� ���� ���� ���� 
				if(idx==books.length) {
					//��ã��
					System.out.println("�ش� ������ �����ϴ�");
				}else if(books[idx].getState()==ILendable.STATE_BORROWED){
					System.out.println(bTitle+"������ �������Դϴ�");
				
				}else {
					//���Ⱑ���̴� ������, ������ �Է¹ް� �������� 
					System.out.print("������?");
					borrower = sc.next();
					System.out.print("��������");
					checkOutDate=sc.next();
					books[idx].checkOut(borrower,checkOutDate);
				}//ã�� -idx������ ��������
				break;
			
			case 2://å�̸� ->å��ȸ-> �ݳ�
//				System.out.println("�ݳ�����");
				System.out.print("�ݳ��� å�̸���?");
				bTitle=sc.next();
				for(idx=0;idx<books.length;idx++) {
					if(bTitle.equals(books[idx].getBookTitle())) {
						break;
					}
				}
				if(idx==books.length) {
					System.out.println("�ش絵���� �� �������� å�� �ƴմϴ�");
				}else {
					books[idx].checkIn();
				}
				break;
			
			case 3://for���� �̿��ؼ� �������� ��� 
//				System.out.println("������ ���� ���");	
				for(Book book : books) {
					book.printState();
				}
			}
		}while(fn!=0);
		System.out.println("�ý��� ����");
		
	}

}
