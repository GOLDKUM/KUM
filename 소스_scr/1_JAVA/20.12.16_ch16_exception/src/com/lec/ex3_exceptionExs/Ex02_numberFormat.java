//2020.12.16 ,yong-kyoung, kum numberFormat
package com.lec.ex3_exceptionExs;

public class Ex02_numberFormat {
	public static void main(String[] args) {
		String str = "";
		int i = 0;
		try {
			i = Integer.parseInt(str.trim());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(i);

	}
}
