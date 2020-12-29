package com.lec.condition;

import java.util.Scanner;

public class EE01_swith {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학점을 작성하시오");
		int grade = scanner.nextInt();
		int temp = grade==100 ? grade-1 :grade;
		
		switch(grade/10){
		
		case 9:
			System.out.println("A학점");break;
		case 8:
			System.out.println("B학점");break;
		case 7:
			System.out.println("C학점");break;
		case 6:
			System.out.println("D학점");break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println("F학점");break;
		default:
			System.out.println("유효하지않는 점수입니다");
		
			
		}
	}

}
