//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

public class Ex01 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");// 무조건 객체 생성

		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 주소");

		} else {
			System.out.println("str1과 str2는 다른 주소");
		}
		str1 = "java2";
		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 주소");

		} else {
			System.out.println("str1과 str2는 다른 주소");
		}

		if (str1 == str3) {
			System.out.println("str1과 str3은 같은 주소");
		} else {
			System.out.println("str1과 str3은 다른 주소 ");
		} // 해시코드 입니다.
		System.out.println(str1.hashCode());
		System.out.println("str2와 str3 같은 스트링이냐?" + str1 == str3 ? "같냐" : "틀리냐"); /* 이건 주소를 물어보는것이 아니라 안에있는 값 주소는 다름 */

		System.out.println("111str2와 str3 같은 스트링이냐?" + (str1.equals(str3) ? "같냐" : "틀리냐"));// 주소를는 다르다
	}

}
