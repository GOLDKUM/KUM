package com.lec.ex02phone;

public class TestMain {
	public static void main(String[] args) {
//		IAcor ob = new IAcor() {
//	}�Ұ���
		AModel aPhone = new AModel();
		BModel bPhone = new BModel();
		CModel cPhone = new CModel();
		//�������̽� �س����ű� ������ IAcor Ÿ������ ����
		IAcor[] phones= {aPhone, bPhone, cPhone};
		for(IAcor phone : phones) {
			//��ü�� Ŭ���� Ÿ��
			System.out.println(phone.getClass().getName());
//			System.out.println(phone.getClass().getName());
//			����κ� �ٽ� ��������!!
			phone.dmbReceive();
			phone.lte();
			phone.tvRemoteControl();
		}

	}
}