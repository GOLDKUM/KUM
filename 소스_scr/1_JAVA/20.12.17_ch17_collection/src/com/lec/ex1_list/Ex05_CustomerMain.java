package com.lec.ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_CustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer, name, phone, address;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		// =Customer[] cs = new Customer[10]; �̷��� arrayList�̱⋚���� �̷��� �ؾ���
		do {
			System.out.print("ȸ������ �����Ͻðڽ��ϱ�(Y/N)");
			answer = sc.next(); // yY nN
			if (answer.equalsIgnoreCase("y")) {// ȸ������ ����
				System.out.println("�����Ͻ� ȸ���� �̸���?");
				name=sc.next();
				System.out.println("�����Ͻ� ȸ���� ��ȭ��ȣ��?");
				phone=sc.next();
				System.out.println("�����Ͻ� ȸ���� �ּ���?");
				sc.nextLine();
				address=sc.nextLine();
				
//				Customer temp =new Customer(name, phone, address);
//				customers.add(temp)
				customers.add(new Customer(name, phone, address));
				
				
			} else if (answer.equalsIgnoreCase("n")) {
				break;
			}

		} while (true);
		System.out.println("������ ȸ�� ����Ʈ ���");
		for(Customer customer: customers) {
			System.out.println(customer);
		}
//		for(int idx=0; idx<customers.size();idx++) {
//			System.out.println(customers.get(idx));
//		}�Ϲ� for�� 
		
	}//main

}//class
