//2020-12-15 ⒦금경용
package com.lec.ex5_scanner;

import java.util.Scanner;

//cf.next()->nextLine()로 버퍼 지우가 -> nextLine()이용
//nextLine()->이용 next()이용
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("주소를 입력하세요");
		String address = sc.nextLine();
		System.out.println("입력하신 주소는"+address);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();//space포함
		System.out.println("입력하신 이름은"+name);
		System.out.print("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("입력하신 나이는"+age);
	}

}
