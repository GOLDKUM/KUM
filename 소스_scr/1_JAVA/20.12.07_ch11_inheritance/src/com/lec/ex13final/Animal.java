package com.lec.ex13final;
/*
 * 오늘날짜,
 */
public class Animal {
	protected int speed;
	public void running() {
//		final int temp=10;
//	temp +=423; 위에 final로 설정했기때문에 수정이 불가하다 
		speed +=5;
		System.out.println("뛰고 있어요. 현재속도:"+speed);
	}
	public final void stop() {
		speed=0;
		System.out.println("멈춤");
	}
	
	
	

}
