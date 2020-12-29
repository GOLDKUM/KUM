package com.lec.condition;

import java.util.Scanner;

public class EE01_ifswith {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학점을 작성하시오");
		int grade = scanner.nextInt();
		if(grade<=100 && grade>=90)
			{System.out.println("A학점입니다");
		}else if(grade>=80 && grade<90) {
			System.out.println("B학점입니다");
		}else if(grade>=70 && grade<80) {
			System.out.println("C학점입니다");		
		}else if(grade>=60 && grade<70) {
			System.out.println("D학점입니다");
		}else if(grade>=0 && grade<60) {
			System.out.println("F학점입니다");
		}else {
			System.out.println("떼끼");
		}scanner.close();
	}
  
	
	

}
