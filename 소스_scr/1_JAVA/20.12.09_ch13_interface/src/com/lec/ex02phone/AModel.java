package com.lec.ex02phone;
//a제품 : DMB송수신불가, 5G, TV리모콘 미탑재, 
public class AModel implements IAcor {
	private String modelName;
	public AModel() {
		modelName="A 모델";
	}
	@Override
	public void dmbReceive() {
		System.out.println(modelName+"은 DMB 수송신 불가 ");

	}

	@Override
	public void lte() {
		System.out.println(modelName+"은 5G");
	
	}

	@Override
	public void tvRemoteControl() {
		System.out.println(modelName+"은 TV리모콘 미탑재");
		
	}

}
