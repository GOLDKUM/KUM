package com.lex.ex;

public class Ex01 {
	public static void main(String[] args) {
		int i = 10; // 변수의 선언(공간확보)과 초기화(숫자입력)
		int[] iArr = { 10, 20, 30, 40, 50 };// 배열변수선언과 초기화 동시에
		iArr[1] = 200; // 배열은 index로 접근(index:0~4)
		for (int idx = 0; idx <= 4; ++idx) {
			System.out.println(iArr[idx]);
		}
		
		int[] iArr2 = new int[5]; //2.배열 변수 선언과 배열메모리 공강 확보
		for(int idx=0 ; idx<iArr2.length ; idx++) {//일반 for문
			System.out.println(idx +"번쨰값:"+iArr2[idx]);
		}
		int[] iArr3;//3.배열 변수 선언
		iArr3 = new int [5];//00000
		for(int idx = 0 ; idx <iArr.length ; idx++) {
			iArr3[idx] = idx+1;
		}
		//for(int temp : iArr3){확장 for문
		
		for(int temp : iArr3) {//확장 for문
			System.out.println(temp);
			
		}
		for(int idx = 0 ; idx <iArr.length ; idx++) {
			iArr3[idx] = 10;//일반 for문으로 값 변경 (0)
		}
		
		
		
		
		
//		System.out.println(iArr[0]);
//		System.out.println(iArr[1]);
//		System.out.println(iArr[2]);
//		System.out.println(iArr[3]);
//		System.out.println(iArr[4]);
//		
	}

}
