//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

public class Ex10_speedChk {
	public static void main(String[] args) {
		String str = "A";

		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str = str.concat("a");
		}

		long end = System.currentTimeMillis();
		System.out.println("스트링 변경시간:" + (end - start));

		StringBuffer strBuff = new StringBuffer("A");

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBuff.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer변경시간:" + (end - start));

		StringBuilder strBuil = new StringBuilder("A");
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBuff.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder 변경시간:" + (end - start));

	}

}
