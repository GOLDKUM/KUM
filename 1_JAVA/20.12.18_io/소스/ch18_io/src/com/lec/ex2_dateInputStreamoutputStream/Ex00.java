//2020/12/18/Kyoung-yong,Kum
package com.lec.ex2_dateInputStreamoutputStream;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer, name, price, ps;
		ArrayList<Product> products = new ArrayList<Product>();

		do {
			System.out.println("��ǰ�� �Է��Ͻðڽ��ϱ�?(Y/N)");
			answer = sc.next();
			if (answer.equalsIgnoreCase("y")) {
				System.out.println("���Ǹ�?");
				name = sc.next();
				System.out.println("������?");
				price = sc.next();
				System.out.println("������?");
				ps = sc.next();

				products.add(new Product(name, price, ps));

			} else if (answer.equalsIgnoreCase("n")) {
				break;
			}

		} while (true);
		System.out.println("��ǰ ���� ���");
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
