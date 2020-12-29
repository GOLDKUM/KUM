//2020-12-15 ⒦금경용
package com.lec.ex3_math;
//반올림 ,올림,과정  
public class Ex02_round {
	public static void main(String[] args) {
		System.out.println("일의 자리까지 반올림, 올림, 버림");
		System.out.println("9.12을 올림: "+Math.ceil(9.12));
		System.out.println("9.12을 반올림: "+Math.round(9.12));//round는 int라서 double이 아님
		System.out.println("9.12을 버림: "+(int)Math.floor(9.12));
		System.out.println();
		System.out.println("소수점 한자리까지 반올림, 올림, 버림");
		System.out.println("9.15을 올림: "+Math.ceil(9.15*10)/10);
		System.out.println("9.15을 반올림: "+Math.round(9.15*10)/10.0);
		System.out.println("9.15을 버림: "+Math.floor(9.15*10)/10);
		System.out.println();
		//round (반올림하고 싶은 수,-1)
		System.out.println("일의 자리에서 반올림, 올림 ,버림");
		System.out.println("85을 올림(90):"+Math.ceil(85/10.0)*10);
		System.out.println("85을 반올림(90):"+Math.round(85/10.0)*10);
		System.out.println("85을 올림(80):"+Math.floor(85/10.0)*10);
		
		
		
	}

}
