package com.lex.squre;

public class SqureMain {
	public static void main(String[] args) {
		Squre s1 = new Squre();
		Squre s2 = new Squre(10);
		System.out.println("s1의 한변의 길이는"+s1.getSide());//get은 한떄만드는거임
		System.out.println("s1의 넓이는"+s1.area());
		System.out.println("s2의 한변의 길이는"+s2.getSide());
		System.out.println("s2의 넓이는"+s2.area());
		s2.setSide(5);//설정하고싶으면 setSide 를 사용한다
		System.out.println("s2의 넓이는"+s2.area());
	}

}
