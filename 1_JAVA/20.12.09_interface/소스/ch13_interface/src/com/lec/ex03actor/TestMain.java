package com.lec.ex03actor; 
//���� implements(���߱���) �� �̿��� ������

public class TestMain {
	public static void main(String[] args) {
		Actor park = new Actor("�ں���");	
		park.canCatchCriminal();
		park.canSearch();
		park.makePizza();
		park.makeSpaghetti();
		park.outFire();
		park.saveMan();
		
		FireFighter firePark=park;
		firePark.saveMan();
		firePark.outFire();
//		firePark.canCatchCriminal();  �翬�� �ȵ��� Ÿ���� �ٸ��� ������
		
		PoliceMan policepark=park;
		policepark.canCatchCriminal();
		policepark.canSearch();
		
		Chef chefPark=park;
		chefPark.makePizza();
		chefPark.makeSpaghetti();
		//�������̽��� ������ �����ϱ� �����ڸ� ���� ���Ѵ�.!!
		//�߻�Ŭ���������� ������ ������ ������ ������� �����Ŵ�!!!
	}

}
