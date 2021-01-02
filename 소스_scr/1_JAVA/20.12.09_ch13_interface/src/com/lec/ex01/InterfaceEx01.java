package com.lec.ex01;
//public 상수와 추상메소드만 올 수 있습니다.
public interface InterfaceEx01 {
	public /* static final */ int CONSTANT_NUM = 10;
	//private 같은거 오지 못함 ! 
	
	public /* abstract */ void method1();
//	/* public void method1() */이건 일반 메소드로 올수없음! 
}
