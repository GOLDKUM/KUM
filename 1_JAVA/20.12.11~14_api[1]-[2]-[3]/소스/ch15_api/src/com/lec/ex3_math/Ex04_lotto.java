//2020-12-15 �ױݰ��
package com.lec.ex3_math;

import java.util.Random;

//�ߺ����� ��
public class Ex04_lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		int sum = 0;

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
		}

		for (int l : lotto) {
			System.out.println(l + "\t");
		}

	}

}
