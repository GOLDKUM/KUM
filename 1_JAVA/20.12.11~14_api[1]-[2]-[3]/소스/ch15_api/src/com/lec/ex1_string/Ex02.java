//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

//다양한 String의 method들
public class Ex02 {
	public static void main(String[] args) {
		String str1 = "abcXabc";
		String str2 = new String("ABCXabc");
		String str3 = "          ja  va";
		System.out.println("1." + str1.concat(str2));// abcXabcABCXabc
		System.out.println("2." + str1.substring(3));// 3번쨰부터 끝까지 abcXabc a는 0번쨰임
		System.out.println("3." + str1.substring(3, 5));// 3번쨰부터 5번쨰앞까지 5번은 포함하지 않음
		System.out.println("4." + str1.length());// 문자길이 7이 나오겠지
		System.out.println("5." + str1.toUpperCase());// 대문자로만 나와라!
		System.out.println("6." + str2.toLowerCase());// 소문자로 나와라!
		System.out.println("7." + str1.charAt(3));// 3 index번째 문자하나!
		System.out.println("8." + str1.indexOf("b"));// 첫b가 있는 index
		System.out.println("9." + str1.indexOf("b", 3));// 3index부터 나오는 첫b의 index
		System.out.println("10." + str1.lastIndexOf("b"));// 마지막b index
		System.out.println("11." + str1.indexOf("z"));// 없으면 -1
		System.out.println("--." + str1.lastIndexOf("b"));// 없으면 -1
		System.out.println("12." + str1.equals(str2));// true | false 대소문자따짐
		System.out.println("13." + str1.equalsIgnoreCase(str2));// true | false 대소문자 가리지 않고 확인해봄
		System.out.println("14." + str3.trim());// 좌우 space제거 좌우에 있는 공간 제거
		System.out.println("15." + str1.replace('a', '뭥'));// a(문자)대신에 뭥으로 바꿔라
		System.out.println("16." + str1.replace("ab", "바꿔"));// ab대신 바꿔로 바꾸는 것
		System.out.println("최종 str:" + str1);// 문자에 있는 데이터는 바꾸지 않음!
	}

}
