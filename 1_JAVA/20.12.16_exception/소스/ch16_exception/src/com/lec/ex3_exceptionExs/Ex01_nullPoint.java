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
				throw new Exception("��������� ���� ���� �޽��� ");
			}catch (Exception e1) {
				
				System.out.println(e1.getMessage());
			}//catch��
			
			greeting="happy";
			System.out.println("���̷� happy�� �ۼ��Ͽ��� ");
		}
	}
	

}
