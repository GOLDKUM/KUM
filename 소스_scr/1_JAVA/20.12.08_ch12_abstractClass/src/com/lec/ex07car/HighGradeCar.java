package com.lec.ex07car;
//LowGradeCar lowCar = new LowGradeCar(“red”,”광폭”,2000,”파워핸드”)
public class HighGradeCar extends Car {
	private int tax = 100000;
	public HighGradeCar(String color, String tire, int displacement, String handle) {
		                   super(color, tire, displacement, handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSpec() {
		System.out.println("=======================================");
		System.out.println("색 상 :"+getColor());
		System.out.println("타이어:"+ getTire());
		System.out.println("배기량:"+getDisplacement());
		System.out.println("핸들: "+getHandle());
		
		if(getDisplacement()>1600) {
			tax+=(getDisplacement()-1500)*200;
			//tax=tax+(getDisplacement()-1600)*200;
		}
		System.out.println("세 금: "+tax);
		System.out.println("=======================================");
	}
}
