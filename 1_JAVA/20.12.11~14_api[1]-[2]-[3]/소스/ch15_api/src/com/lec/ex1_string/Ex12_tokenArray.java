//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

import java.util.StringTokenizer;

public class Ex12_tokenArray {
	public static void main(String[] args) {

		String str = "������ ���ػ� ������ ������ ������";
		String[] names;
		StringTokenizer tokenizer = new StringTokenizer(str, "\t");
		System.out.println(str);
		System.out.println("=========================");
		names = new String[(tokenizer.countTokens())];

		int idx = 0;
		while (tokenizer.hasMoreTokens()) {
			names[idx++] = tokenizer.nextToken();
		}
		System.out.println("����� �迭�� ������ Ȯ��");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
