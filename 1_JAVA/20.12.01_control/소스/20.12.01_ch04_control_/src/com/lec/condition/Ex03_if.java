package com.lec.condition;

import java.util.Scanner;

public class Ex03_if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번쨰 수는?");
		int num1 = scanner.nextInt();
		System.out.print("두번쨰 수는?");
		int num2 = scanner.nextInt();
		if(num1>=num2) {
			System.out.println("입력하신 값들의 최대값은"+num1);
			
		}else {System.out.println("입력하신 값들의 쵀대값은"+num2);
		}
		
	}
}  

