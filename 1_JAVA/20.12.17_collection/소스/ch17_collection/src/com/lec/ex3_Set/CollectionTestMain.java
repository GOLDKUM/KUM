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
			System.out.print("ȸ������ �����Ͻðڽ��ϱ�(Y/N)");
			answer = sc.next(); // yY nN

			if (answer.equalsIgnoreCase("y")) {
				System.out.println("�̸���?");
				name = sc.next();
				System.out.println("��ȭ��ȣ��?");
				phone = sc.next();
				System.out.println("�ּ���?");
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
