//2020-12-15 �ױݰ��
package com.lec.ex3_math;

import java.util.Random;

public class Ex03_random {
	public static void main(String[] args) {
		System.out.println((int) (Math.random() * 45) + 1);
		Random random = new Random();
		System.out.println("int ����:" + random.nextInt());// ����
		System.out.println("0~100���� ����:" + random.nextInt(101));// 0~100���� ����
		System.out.println("0~44���� ����: " + random.nextInt(45));
		System.out.println("1~45���� ����: " + (random.nextInt(45) + 1));
		System.out.println("double ���� " + random.nextDouble());// 0~1�̳��� ����
		System.out.println("T/f�߿� �ϳ�����:" + random.nextBoolean());// false true ���� �ϳ��� �����ں�� ����

	}

}
