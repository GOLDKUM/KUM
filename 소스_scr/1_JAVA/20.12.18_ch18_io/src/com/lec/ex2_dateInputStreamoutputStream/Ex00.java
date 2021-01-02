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
			System.out.println("상품을 입력하시겠습니까?(Y/N)");
			answer = sc.next();
			if (answer.equalsIgnoreCase("y")) {
				System.out.println("물건명?");
				name = sc.next();
				System.out.println("가격은?");
				price = sc.next();
				System.out.println("갯수는?");
				ps = sc.next();

				products.add(new Product(name, price, ps));

			} else if (answer.equalsIgnoreCase("n")) {
				break;
			}

		} while (true);
		System.out.println("상품 가입 목록");
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
