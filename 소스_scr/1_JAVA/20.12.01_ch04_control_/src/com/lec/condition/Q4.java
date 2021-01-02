package com.lec.condition;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("지금 몇뭘이예요?");
		int yue = scanner.nextInt();
//			
		switch(yue){ case 12: case 1: case 2:
			System.out.println("겨울이네요");break;
		case 3: case 4: case 5:
			System.out.println("봄이네요");break;
		case 6: case 7: case 8:
			System.out.println("여름이네요");break;
		case 9: case10: case11:
			System.out.println("가을이네요");break;
		default:
			System.out.println("떼끼");
		
		}
				
	}

}
