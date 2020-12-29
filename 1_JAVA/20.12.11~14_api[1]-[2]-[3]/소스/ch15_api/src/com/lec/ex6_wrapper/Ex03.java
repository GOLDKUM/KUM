//2020-12-15 ⒦금경용
package com.lec.ex6_wrapper;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("스트링을 정수: Integer.parseInt(문자열)");
		int i =Integer.parseInt("123");
		System.out.println(i);//스트링을 정수로 바꾸줌
		
		System.out.println("===========================");
		System.out.println("정수를 스트링: String.valueOf(정수값)");
//		String monthString = ""+12;
		String monthString = String.valueOf(12);
		System.out.println(monthString);
	}

}
