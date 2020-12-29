package com.lec.ex07car;

//LowGradeCar lowCar = new LowGradeCar(“red”,”광폭”,2000,”파워핸드”)
//final 정수만 대문자로 써야함 !! 
public abstract class Car {
	private String color;      //차색상
	private String tire;      //타이어
	private int displacement;//배기량 
	private String handle;
	
	public Car(String color, String tire, int displacement, String handle) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}
	public abstract void getSpec();
	
	public String getColor() {
		return color;
	}
	public String getTire() {
		return tire;
	}
	public int getDisplacement() {
		return displacement;
	}
	public String getHandle() {
		return handle;
	} 
	
	
}
