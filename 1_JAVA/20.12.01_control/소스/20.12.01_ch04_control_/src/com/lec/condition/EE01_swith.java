package com.lec.condition;

import java.util.Scanner;

public class EE01_swith {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �ۼ��Ͻÿ�");
		int grade = scanner.nextInt();
		int temp = grade==100 ? grade-1 :grade;
		
		switch(grade/10){
		
		case 9:
			System.out.println("A����");break;
		case 8:
			System.out.println("B����");break;
		case 7:
			System.out.println("C����");break;
		case 6:
			System.out.println("D����");break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println("F����");break;
		default:
			System.out.println("��ȿ�����ʴ� �����Դϴ�");
		
			
		}
	}

}
