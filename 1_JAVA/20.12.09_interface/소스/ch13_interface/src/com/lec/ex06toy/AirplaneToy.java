package com.lec.ex06toy;

public class AirplaneToy implements IMissile,ILight{
	
	public AirplaneToy() {
		System.out.println("����� �峭���Դϴ�");
		canLight();
		canMissle();
		System.out.println("============================");
	}
		
	@Override
	public void canLight() {
		System.out.println("�Һ� �߻� �����մϴ�");
		
	}

	@Override
	public void canMissle() {
		System.out.println("�̻��� �� �� �ֽ��ϴ�.");
	}
	@Override
	public String toString() {
	
		return "�Һ��� �̻��� ������ �����";
	}

}
