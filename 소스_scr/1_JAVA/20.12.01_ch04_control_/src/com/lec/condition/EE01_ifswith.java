package com.lec.condition;

import java.util.Scanner;

public class EE01_ifswith {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �ۼ��Ͻÿ�");
		int grade = scanner.nextInt();
		if(grade<=100 && grade>=90)
			{System.out.println("A�����Դϴ�");
		}else if(grade>=80 && grade<90) {
			System.out.println("B�����Դϴ�");
		}else if(grade>=70 && grade<80) {
			System.out.println("C�����Դϴ�");		
		}else if(grade>=60 && grade<70) {
			System.out.println("D�����Դϴ�");
		}else if(grade>=0 && grade<60) {
			System.out.println("F�����Դϴ�");
		}else {
			System.out.println("����");
		}scanner.close();
	}
  
	
	

}
