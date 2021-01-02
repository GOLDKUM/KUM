package com.lec.loop;

public class Ex05forBreakcontinue {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			if (i == 5) {
				//break;// 반복문 블럭을 빠져 나가
				continue; //증감식으로 올라감 
			}
			System.out.print(i + " ");
		}
	}

}
