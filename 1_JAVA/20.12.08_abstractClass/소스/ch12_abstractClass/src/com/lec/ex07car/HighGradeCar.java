package com.lec.ex07car;
//LowGradeCar lowCar = new LowGradeCar(��red��,��������,2000,���Ŀ��ڵ塱)
public class HighGradeCar extends Car {
	private int tax = 100000;
	public HighGradeCar(String color, String tire, int displacement, String handle) {
		                   super(color, tire, displacement, handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSpec() {
		System.out.println("=======================================");
		System.out.println("�� �� :"+getColor());
		System.out.println("Ÿ�̾�:"+ getTire());
		System.out.println("��ⷮ:"+getDisplacement());
		System.out.println("�ڵ�: "+getHandle());
		
		if(getDisplacement()>1600) {
			tax+=(getDisplacement()-1500)*200;
			//tax=tax+(getDisplacement()-1600)*200;
		}
		System.out.println("�� ��: "+tax);
		System.out.println("=======================================");
	}
}
