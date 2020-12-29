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
		System.out.println("��Ʈ�� ����ð�:" + (end - start));

		StringBuffer strBuff = new StringBuffer("A");

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBuff.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer����ð�:" + (end - start));

		StringBuilder strBuil = new StringBuilder("A");
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			strBuff.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder ����ð�:" + (end - start));

	}

}
