package com.lec.ex02phone;////상수와 추상메서드만 올수있음 
//A전자에서 A model, B model, C model
public interface IAcor {//작업 명세서
	public void dmbReceive(); // dmb여부 구현은 클래스
	public void lte();
	public void tvRemoteControl();
	
	

}
