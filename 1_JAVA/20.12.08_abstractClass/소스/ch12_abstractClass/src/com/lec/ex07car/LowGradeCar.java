package com.lec.ex07car;

public class LowGradeCar extends Car {
	private int tax =50000;
	public LowGradeCar(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle); //하는 이유는 매개변수 없는대로 가지말고 매개변수 있는대로 바로 가라고 해라고 
	}

	@Override
	public void getSpec() {// spec들 출력(tax포함)
		System.out.println("========================");
		System.out.println("색 상 :"+getColor());
		System.out.println("타이어:"+ getTire());
		System.out.println("배기량:"+getDisplacement());
		System.out.println("핸들: "+getHandle());
		
		if(getDisplacement()>1000) {
			 tax+=(getDisplacement()-1000)*100;
			//tax=tax+(getDisplacement()-1000)*100;
		}
		System.out.println("세 금: "+tax);
		System.out.println("==========================");
	}

}
