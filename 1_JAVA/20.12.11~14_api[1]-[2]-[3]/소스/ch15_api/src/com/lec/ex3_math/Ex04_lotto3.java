//2020-12-15 ⒦금경용
package com.lec.ex3_math;

import java.util.Random;

public class Ex04_lotto3 {
	public static void main(String[] args) {

		Random random = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int temp = random.nextInt(45) + 1;
			boolean ok = true;
			for (int j = 0; j < i; j++) {
				if (temp == lotto[j]) {
					i--;
					ok = false;
					break;
				} // if문
			} // for문
			if (ok) {
				lotto[i] = temp;
			}
		}
		for (int l : lotto) {
			System.out.println(l + "\t");
		}

	}

}
