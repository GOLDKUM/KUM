package com.lec.ex3_Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionTestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = null, name, phone, address;
		HashMap<String, Collection> hashmaps = new HashMap<String,Collection>();

		do {
//			
			System.out.print("회원가입 진행하시겠습니까(Y/N)");
			answer = sc.next(); // yY nN

			if (answer.equalsIgnoreCase("y")) {
				System.out.println("이름은?");
				name = sc.next();
				System.out.println("전화번호는?");
				phone = sc.next();
				System.out.println("주소은?");
				sc.nextLine();
				address = sc.nextLine();
				hashmaps.put(phone, new Collection (name,phone,address));
			} 
			 else if (answer.equalsIgnoreCase("n")) {
				break;
			}
		} while (true);
		sc.close();
		
		Iterator<String> iterator = hashmaps.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(hashmaps.get(key));
		}

//		try{		
//		}catch(Exception e) {
//		System.out.println(e.getMessage());
//	}

	}

}
