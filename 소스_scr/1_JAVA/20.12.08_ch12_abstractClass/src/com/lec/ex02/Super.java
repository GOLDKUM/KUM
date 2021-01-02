package com.lec.ex02;
// 추상ㅇ클래스는 한개이상의 추상메소들르 갖
// Super s = new Super();
// s. method1(); 추상클래스는 객체를 만들수가 없음 !! 
public abstract class Super {
	public Super() {} // 디폴트 생성자 
	public abstract void method1();// 추상메소드  이름만 있을뿐 호출할수 없음 why 그냥선언만 한거임
	public void method2() {
		System.out.println("Super의 method2()");
	}
	
	

}
