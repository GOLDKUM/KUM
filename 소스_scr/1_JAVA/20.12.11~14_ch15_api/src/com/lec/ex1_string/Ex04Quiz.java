//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

import java.util.Scanner;

//I:chenckIn("�ݳ��Ǿ����ϴ�"���), o:checkOut("����Ǿ����ϴ�"���)
public class Ex04Quiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fn;

		while (true) {
			System.out.println("I:chenckIn(\"�ݳ��Ǿ����ϴ�\"���), " + "o:checkOut(\"����Ǿ����ϴ�\"���),x:Exit");
			fn = scanner.next();
			if (fn.equalsIgnoreCase("x")) {
				break;
			}
			if (fn.equals("i") || fn.equals("I")) {
				System.out.println("�ݳ��Ǿ����ϴ�");
			} else if (fn.equalsIgnoreCase("o")) {
				System.out.println("����Ǿ����ϴ�");
			}

		}

	}
}
