//2020.12.16 ,yong-kyoung, kum
package com.lec.ex0_twoScanner;

import java.util.Scanner;

public class ExScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.next();
		System.out.println("�Է��� �̸���" + name);
		nickName();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("�Է��� ���̴�" + age);
		sc.close();

	}

	private static void nickName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		String nickName = sc.next();
		System.out.println("������" + nickName);
		sc.close();
	}
}
