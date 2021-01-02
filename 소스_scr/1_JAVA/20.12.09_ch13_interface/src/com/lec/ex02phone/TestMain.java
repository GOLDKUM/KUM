package com.lec.ex02phone;

public class TestMain {
	public static void main(String[] args) {
//		IAcor ob = new IAcor() {
//	}불가능
		AModel aPhone = new AModel();
		BModel bPhone = new BModel();
		CModel cPhone = new CModel();
		//인터페이스 해놓은거기 떄문에 IAcor 타입으로 가능
		IAcor[] phones= {aPhone, bPhone, cPhone};
		for(IAcor phone : phones) {
			//객체의 클래스 타입
			System.out.println(phone.getClass().getName());
//			System.out.println(phone.getClass().getName());
//			여기부분 다시 이해하자!!
			phone.dmbReceive();
			phone.lte();
			phone.tvRemoteControl();
		}

	}
}