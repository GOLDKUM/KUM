package com.lec.loop;

import java.util.Scanner;

public class Ex10dowhile_ramdonNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lotte = (int) (Math.random() * 45) + 1; //컴퓨터 로또 난수  
		int su; //=사용자에게 입력받은 수를 저장하는 변수 
		do {
			System.out.print("로또 번호 한개를 알아맞춰 보세요");
			su=scanner.nextInt();
			if(su>lotte) {
				System.out.println(su+"보다 작은수를 도전하세요");
			}else if(su<lotte) {
				System.out.println(su+"보다 큰수를 도전하세요");
			}
		}while(su!=lotte);
		System.out.println("축하축하 마추셨습니다.");

//		// 1단계 컴퓨터가 아무거나 숫자를 정함
//		System.out.println(Math.random());// 0~1미만의 난수 실수
//		System.out.println(Math.random() * 45);// 0이상 45미만의 난수실수
//		System.out.println((int) (Math.random() * 45));// 0~44이상의 난수 //여기에 인트값이 있기때문에 
//		System.out.println((int) (Math.random() * 45) + 1);// 1~45이상의 난수
}

}
