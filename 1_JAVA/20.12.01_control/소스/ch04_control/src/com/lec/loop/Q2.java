package com.lec.loop;

public class Q2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1 ; i<11 ; i+=2) {
			sum+=i;
		}
			
//		for(int i=1초기값 ; i<11반복할조건 ; i++증감식) {
//			if(i%2==1) {
////			sum +=i;	==  sum= sum+i/
//				
//			}
//		}
		System.out.println("1~10까지의 홀수의 합"+ sum);
	}

}
