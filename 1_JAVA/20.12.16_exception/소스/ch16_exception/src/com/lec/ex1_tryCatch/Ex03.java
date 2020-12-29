//2020.12.16 ,yong-kyoung, kum, tryCatch
package com.lec.ex1_tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

//do while ������ ~! 
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j = 1;

		do {
			try {
				System.out.print("ù���� ���� ?");
				i = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("ù���� ���� ���ڸ� ���� ������");
				sc.nextLine();
			}
		} while (true);

		System.out.print("�ι��� ����");
		try {
			j = sc.nextInt();
			System.out.println("i =" + i + ", j=" + j);
			System.out.println("i*j=" + (i * j));
			System.out.println("i/j=" + (i / j));

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + "0���� ������ ���� �н�~!");

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("�ι��� ���� �߸� �Է��ϼż� 1�� �ʱ�ȭ�ϰڽ��ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ �����ϱ��?");
			System.out.println(e.getMessage());
		}

		System.out.println("i+j=" + (i + j));
		System.out.println("i-j=" + (i - j));
		System.out.println("DONE");
		sc.close();
	}
}
