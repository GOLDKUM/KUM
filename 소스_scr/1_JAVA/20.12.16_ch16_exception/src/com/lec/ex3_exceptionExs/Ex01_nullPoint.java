//2020.12.16 ,yong-kyoung, kum nullPoint
package com.lec.ex3_exceptionExs;

public class Ex01_nullPoint {
	public static void main(String[] args) {
		String greeting = "Hello";
		System.out.println(greeting.toUpperCase());
		greeting=null;
		
		try {
			System.out.println(greeting.toUpperCase());
		}catch(NullPointerException e) {
			try {
				throw new Exception("내마음대로 만든 에러 메시지 ");
			}catch (Exception e1) {
				
				System.out.println(e1.getMessage());
			}//catch절
			
			greeting="happy";
			System.out.println("임이로 happy로 작성하였음 ");
		}
	}
	

}
