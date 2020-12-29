//2020-12-15 ⒦금경용
package com.lec.ex6_wrapper;

public class Ex02 {

	public static void main(String[] args) {
		int total=valueSum("10","20","30","40");
		System.out.println("들어온 값의 한계는"+total);
		
	}
	private static int valueSum(String...value ) {
//		Stirng[]value= {"10","20","30","40"};
		
		int result=0;//누적변수
		for(int i=0; i<value.length;i++) {
			//result+=value[i]; //지금 스트링으로 되서 누적을 할수없음 
			result+=Integer.parseInt(value[i]); //지금 스트링을 정수로 바꿔주는 역할을 함!
			//Integer.parseInt(val); val문자열을 정수로 바꿔줌 ! 
		}
		return result;
	}

	
	

}
