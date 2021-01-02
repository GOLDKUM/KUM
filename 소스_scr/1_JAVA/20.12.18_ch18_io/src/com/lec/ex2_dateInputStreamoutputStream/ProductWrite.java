//2020/12/18/Kyoung-yong,Kum
package com.lec.ex2_dateInputStreamoutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductWrite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer, name, price, ps;
		ArrayList<Product> products = new ArrayList<Product>();

		OutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("txtFile/dateFile.dat");
			dos = new DataOutputStream(fos);
			do {
				System.out.println("��ǰ�� �Է��Ͻðڽ��ϱ�?(Y/N)");
				answer = sc.next();
				if (answer.equalsIgnoreCase("y")) {
					System.out.println("���Ǹ�?");
					name = sc.next();
					dos.writeUTF(name);
					System.out.println("������?");
					price = sc.next();
					dos.writeUTF(price);
					System.out.println("������?");
					ps = sc.next();
					dos.writeUTF(ps);
					products.add(new Product(name, price, ps));
				} else if (answer.equalsIgnoreCase("n")) {
					break;
				}

			} while (true);
			System.out.println("��ǰ���");
			for (Product product : products) {
				System.out.println(product);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (dos != null)
					dos.close();
				if (fos != null)
					fos.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
