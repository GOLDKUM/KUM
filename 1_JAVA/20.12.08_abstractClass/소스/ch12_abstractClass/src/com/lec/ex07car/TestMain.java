package com.lec.ex07car;

import com.lec.cons.CarSpec;

public class TestMain {
	public static void main(String[] args) {
		Car lowCar = new LowGradeCar(CarSpec.GRAY_CAR,
				CarSpec.TIRE_NORMAL,
				CarSpec.DISPLACEMENT_1000,
				CarSpec.HANDLE_POWER);
		Car highCar=new HighGradeCar(CarSpec.WHITE_CAR,
				CarSpec.TIRE_WIDE,
				CarSpec.DISPLACEMENT_2000,
				CarSpec.HANDLE_POWER);
//		Car[]car= {lowCar,highCar}; // 상속의 장점 !하나는 상속시킬려고  두번째는 형Car을 마추려고!! 
		lowCar.getSpec();
		highCar.getSpec();
		
	}

}
