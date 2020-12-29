package com.lex.ex3_accessTest;

public class AccessTest {
	private int privateMember; //같은 클래스 내에서만
	int defaultMember;//디폴트 같은 패키지안에서만 
	protected int protectMember;//같은 패키지나 상속받은 하위클래스에서
	public int publicMember;// 외부에서 아무데나 
	public char[] protectedMember;
	private void privateMethod() {//같은 클래스 내에서만
		System.out.println("private 메소드 호출");
	}
	void defaultMethod() {//같은 패키지에서만 
		System.out.println("디폴트 메소드 호출");
	}
	protected void protectMethod() {
		System.out.println("protected 메소드호출");
	}
	public void publicMethod() {
		System.out.println("public 메소드호출");
	}
	public void protectedMember() {
		// TODO Auto-generated method stub
		
	}
}
