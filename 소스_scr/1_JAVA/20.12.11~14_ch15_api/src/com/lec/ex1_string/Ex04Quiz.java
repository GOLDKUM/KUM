//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

import java.util.Scanner;

//I:chenckIn("반납되었습니다"출력), o:checkOut("대출되었습니다"출력)
public class Ex04Quiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fn;

		while (true) {
			System.out.println("I:chenckIn(\"반납되었습니다\"출력), " + "o:checkOut(\"대출되었습니다\"출력),x:Exit");
			fn = scanner.next();
			if (fn.equalsIgnoreCase("x")) {
				break;
			}
			if (fn.equals("i") || fn.equals("I")) {
				System.out.println("반납되었습니다");
			} else if (fn.equalsIgnoreCase("o")) {
				System.out.println("대출되었습니다");
			}

		}

	}
}
