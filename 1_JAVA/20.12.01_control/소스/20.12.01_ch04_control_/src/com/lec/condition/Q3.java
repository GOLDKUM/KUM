package com.lec.condition;

import java.util.Scanner;

//사용자로부터 가위(0), 바위(1), 보(2) 중 입력받고,
//컴퓨터도 가위(0) 바위(1) 보(2) 중 하나를 선택해서 승자를 출력!
public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2)중 하나를 선택:");
		int you = scanner.nextInt();
		if(you==0) {
			System.out.println("가위를 내셨네");
		}else if(you==1) {
			System.out.println("바위를 내셨네");
		}else if(you==2) {
			System.out.println("보를 내셨네");
		}else {
			System.out.println("떼끼");
            System.exit(0);
		}
		scanner.close();
		
		int computer = (int)(Math.random()*3);
		if(computer==0) {
			System.out.println("컴은 가위야");
		}else if(computer==1) {
			System.out.println("컴은 바위야");
		}else {
			System.out.println("컴은 보야");
		}
		                                                //Math.random():0부터 1보다 작은 실수 난수를 발생 
//      노가다		                                   //System.out.println((int)(Math.random()*3));//곱하기를 하여 0~2.99999
//		if(you==0) {
//			if(computer==0) {
//				System.out.println("비겼다");
//			}else if(computer==1) {
//				System.out.println("컴퓨터가 승");
//			}else {
//				System.out.println("당신이 이겼다");
//			}
		if((you+2)%3 == computer){
			System.out.println("당신이 이겼다");
		}else if(you==computer) {
			System.out.println("비겼다");
		}else {
			System.out.println("컴퓨터가 이겼다");
		}
		}
		
		
		
}


