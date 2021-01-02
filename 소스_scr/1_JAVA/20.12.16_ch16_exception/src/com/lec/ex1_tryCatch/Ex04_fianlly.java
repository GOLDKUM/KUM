//2020.12.16 ,yong-kyoung, kum, finally
package com.lec.ex1_tryCatch;

public class Ex04_fianlly {
	public static void main(String[] args) {
		int[] iArr = {0,1,2};
		for(int i =0; i<=iArr.length; i++) {
			try {
				System.out.println("iArr["+i+"]="+iArr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("예외 메세지:"+e.getMessage());
			}finally {
				System.out.println("아무문제 없어도 finally 실행 ,"
						+ "try절 실행후에도 catch절후에도 finally실행 ");
			}
		}//for
		System.out.println("프로그램 끝");
	}//main

}
