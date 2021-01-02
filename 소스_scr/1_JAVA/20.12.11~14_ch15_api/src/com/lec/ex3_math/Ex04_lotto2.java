//2020-12-15 �ױݰ��
package com.lec.ex3_math;

import java.util.Random;

//�ߺ����� �ʰ� �ذ�
public class Ex04_lotto2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		int sum = 0;
		while (121 < sum && sum < 180) {
			for (int i = 0; i < lotto.length; i++) {// �氹�� 6��
				int temp = random.nextInt(45) + 1;
				boolean ok = true;
				for (int j = 0; j < i; j++) {
					if (temp == lotto[j]) {
						i--;
						ok = false;
						break;

					}
				} // for -�ߺ�Ȯ��
				if (ok) {
					lotto[i] = temp;
				}
				sum += lotto[i];
			}
			for (int l : lotto) {
				System.out.print(l + "\t");

			}
			if (121 < sum && sum < 180) {
				System.out.println(sum);
			} else {
				System.out.println("�ٽ��ϼ���");
			}
		}

	}

}
