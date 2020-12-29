//2020.12.16 ,yong-kyoung, kum
package com.lec.ex1_tryCatch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.print("첫번쨰 수는 ?");
		i = sc.nextInt();
		System.out.print("두번쨰 수는");
		j = sc.nextInt();
		System.out.println("i =" + i + ", j=" + j);
		System.out.println("i*j=" + (i * j));
		System.out.println("i/j=" + (i / j));
		System.out.println("i+j=" + (i + j));
		System.out.println("i-j=" + (i - j));
		System.out.println("DONE");
		sc.close();
	}
}
