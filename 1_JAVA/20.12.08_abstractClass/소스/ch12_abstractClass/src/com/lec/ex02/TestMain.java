package com.lec.ex02;

public class TestMain {
	public static void main(String[] args) {
//		Super s; 가능
//		Super s =new Super(); 추상클래스는 객체를 생성할 수 없다 .
//		Super s =new Super() {
//			
//			@Override
//			public void method1() {
//				System.out.println("안드로이드에서만 이런 거 씀!");
//				
//			}
//		};
//		s.method1();
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		Super c2 = new Child();
		c2.method1();
		c2.method2();
		//c2.methold3(), 불가 (c2변가수 Super타입이르모 Super의 것만 가능 
	}

}
