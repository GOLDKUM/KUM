//2020-12-15 ⒦금경용
package com.lec.ex3_math;

import java.util.Random;

public class Ex03_random {
	public static void main(String[] args) {
		System.out.println((int) (Math.random() * 45) + 1);
		Random random = new Random();
		System.out.println("int 난수:" + random.nextInt());// 정수
		System.out.println("0~100까지 난수:" + random.nextInt(101));// 0~100까지 나옴
		System.out.println("0~44까지 난수: " + random.nextInt(45));
		System.out.println("1~45까지 난수: " + (random.nextInt(45) + 1));
		System.out.println("double 난수 " + random.nextDouble());// 0~1이네의 숫자
		System.out.println("T/f중에 하나선택:" + random.nextBoolean());// false true 둘중 하나를 마구자비로 뽑음

	}

}
