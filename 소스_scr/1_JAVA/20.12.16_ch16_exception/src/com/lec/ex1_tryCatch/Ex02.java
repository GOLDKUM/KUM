//2020.12.16 ,yong-kyoung, kum, tryCatch
package com.lec.ex1_tryCatch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.print("첫번쨰 수는 ?");
		i = sc.nextInt();
		System.out.print("두번쨰 수는 ?");
		j = sc.nextInt();
		System.out.println("i =" + i + ", j=" + j);
		System.out.println("i*j=" + (i * j));

		try {
			System.out.println("i/j=" + (i / j));
		} catch (ArithmeticException e) {
			// e.printStackTrace();//예외사황을 자세히 출력 (초보자에게 적합)
			System.out.println(e.getMessage());// 예외메시지만 출력
		}

		System.out.println("i+j=" + (i + j));
		System.out.println("i-j=" + (i - j));
		System.out.println("DONE");
		sc.close();
	}
}
