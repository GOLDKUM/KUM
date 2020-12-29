//2020-12-15 ⒦금경용
package com.lec.ex5_scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();//\n
		System.out.println("입력하신 나이는"+age);
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();//"\n홍길동"여기로 들어감 그리고 \n남음
		//버퍼에 처음 나오는 \n은 무시하고 whiteSpace나오는 전까지 취향
		
		System.out.println("입력하신 이름은:"+name);
		System.out.print("주소를 입력하세요");
		
		sc.nextLine();//버퍼 지우기 (\n떄문에) 
		String address = sc.nextLine();//버퍼에 \n이 나오는 앞까지 
		System.out.println("입력하신 주소는"+address);		
		System.out.println("==========프로그램 끝=========");
	}
	

}
