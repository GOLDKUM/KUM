package com.lex.squre;
//Squre s1 = new Squre() 이런거 쓰려고 만듬
//Squre s1 = new Squre(10<-매개변수);선생님의 역심
//Scanner sc = new Scanner(System.in)
public class Squre {
	private int side;
	public Squre() {// 디폴트 생성자(매개변수 없는 생성자=>생성자 오버로딩)
		System.out.println("매개변수 없는 생성자 호출됨");
	}

	public Squre(int side) {// 매개변수 있는 생성자 =>
		this.side=side;
		System.out.println("매개 변수 있는 생성자 호출됨");
	}
	public int area() {
		return side*side;
	}
	
	public int getSide() {   //~.getSide()
		return side;
	}
	//~.setSide(10)
	public void setSide(int side) {
		this.side = side;
	}
	
}
