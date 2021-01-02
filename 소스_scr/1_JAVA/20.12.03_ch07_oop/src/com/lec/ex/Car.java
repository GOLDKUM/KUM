package com.lec.ex;
//Car myPorsche = new car();
//myPorsche.color="red";
//Scanner sc = new Scanner(~);
public class Car {
	private String color;//데이터(private), 메소드(public)
	private int cc;
	private int speed;
	public Car() {//생성자 = 리턴타입이 없고 클래스명과 같은 이름의 메소드
		//디폴트 생성자함수는 생성자함수가 없을때 jVM이 자동생성
		//객체 변수가 생성될 떄 자동호출(실행)
		cc = 1000; 
	}
	public void drive() {      //메소드(public)들
		speed = 60;
		System.out.println("운전한다 지금속도: "+speed);
	}
	public void park() {
		speed=0;
		System.out.println("주차한다 지금 속도: "+speed);
	}
	public void race() {
		System.out.println("레이싱한다. 지금속도 :"+speed);
	}
	//~.setColor("red")
	public void setColor(String color) {
		this.color = color;
	}
	//~.getColor()
	public String getColor() {
		return color;
	}
	//~.getCc()
	public int getCc() {
		return cc;
	}
}	


