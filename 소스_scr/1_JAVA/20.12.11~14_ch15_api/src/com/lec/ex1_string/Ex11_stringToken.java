//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

import java.util.StringTokenizer;

public class Ex11_stringToken {
	public static void main(String[] args) {
		String str1 = "정해인 유준상 강동원 김윤석 하정우";
		String str2 = "2020/12/14,2020/12/15";

		StringTokenizer token1 = new StringTokenizer(str1);
		StringTokenizer token2 = new StringTokenizer(str2, ",");
		System.out.println("+++=============================");
		System.out.println("token1의 갯수 :" + token1.countTokens());
		System.out.println("+++=============================");

		while (token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		System.out.println("token2의 갯수:" + token2.countTokens());
		while (token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}

	}

}
