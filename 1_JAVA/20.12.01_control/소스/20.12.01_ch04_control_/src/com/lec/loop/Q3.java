package com.lec.loop;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇단을 원하시나요");
		int dansu = scanner.nextInt();
		for(int i=1 ; i<10 ; i++) {
			System.out.println(dansu+"*"+i+"="+(dansu*i));
		  //System.out.printf("%d*%d=%2d\n",dansu,i,dansu*i);
		}
		
	
		
	}

}
//int i, j;
//for(i=2; i<=9; i++){ }

//System.out.printf("%d %c %d = %d\n",n1, '|',n2,result);
//Scanner scanner = new Scanner(System.in);
//System.out.print("첫번쨰 수는?");
//int num1 = scanner.nextInt();