//2020.12.16 ,yong-kyoung, kum, tryCatch
package com.lec.ex1_tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

//do while 문으로 ~! 
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j = 1;

		do {
			try {
				System.out.print("첫번쨰 수는 ?");
				i = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("첫번쨰 수에 문자를 넣지 마세요");
				sc.nextLine();
			}
		} while (true);

		System.out.print("두번쨰 수는");
		try {
			j = sc.nextInt();
			System.out.println("i =" + i + ", j=" + j);
			System.out.println("i*j=" + (i * j));
			System.out.println("i/j=" + (i / j));

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + "0으로 나누는 것은 패스~!");

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("두번쨰 수를 잘못 입력하셔서 1로 초기화하겠습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("무엇이 에러일까요?");
			System.out.println(e.getMessage());
		}

		System.out.println("i+j=" + (i + j));
		System.out.println("i-j=" + (i - j));
		System.out.println("DONE");
		sc.close();
	}
}
