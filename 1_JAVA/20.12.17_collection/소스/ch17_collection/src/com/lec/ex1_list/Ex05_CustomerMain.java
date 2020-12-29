package com.lec.ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_CustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer, name, phone, address;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		// =Customer[] cs = new Customer[10]; 이렇게 arrayList이기떄문에 이렇게 해야함
		do {
			System.out.print("회원가입 진행하시겠습니까(Y/N)");
			answer = sc.next(); // yY nN
			if (answer.equalsIgnoreCase("y")) {// 회원가입 진행
				System.out.println("가입하실 회원님 이름은?");
				name=sc.next();
				System.out.println("가입하실 회원님 전화번호은?");
				phone=sc.next();
				System.out.println("가입하실 회원님 주소은?");
				sc.nextLine();
				address=sc.nextLine();
				
//				Customer temp =new Customer(name, phone, address);
//				customers.add(temp)
				customers.add(new Customer(name, phone, address));
				
				
			} else if (answer.equalsIgnoreCase("n")) {
				break;
			}

		} while (true);
		System.out.println("가입한 회원 리스트 목록");
		for(Customer customer: customers) {
			System.out.println(customer);
		}
//		for(int idx=0; idx<customers.size();idx++) {
//			System.out.println(customers.get(idx));
//		}일반 for문 
		
	}//main

}//class
