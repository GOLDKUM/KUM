//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

import java.util.Scanner;

public class Ex06searchTel {
	public static void main(String[] args) {
		String[] tels = { "010-9999-9999", "010-8888-8888", "010-7777-7777" };
		Scanner scanner = new Scanner(System.in);
		boolean searchOk = false;
		System.out.print("ã�����ϴ� ��ȭ��ȣ ���ڸ� :");
		String searchTel = scanner.next();
		for (int idx = 0; idx < tels.length; idx++) {
			String temp = tels[idx];
			String post = temp.substring(temp.lastIndexOf("-") + 1);
			if (searchTel.equals(post)) {
				System.out.println("��ȣ��ü��" + tels[idx]);
				searchOk = true;

			} // if
		} // for
		if (!searchOk) {
			System.out.println("�Է��Ͻ� ��ȭ��ȣ�� ���� ��ȣ�Դϴ�.");
		} // if
	}// main

}// class
