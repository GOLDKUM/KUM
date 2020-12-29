package com.lec.ex03actor; 
//다중 implements(다중구현) 를 이용한 다형성

public class TestMain {
	public static void main(String[] args) {
		Actor park = new Actor("박보검");	
		park.canCatchCriminal();
		park.canSearch();
		park.makePizza();
		park.makeSpaghetti();
		park.outFire();
		park.saveMan();
		
		FireFighter firePark=park;
		firePark.saveMan();
		firePark.outFire();
//		firePark.canCatchCriminal();  당연히 안되지 타입이 다르기 떄문에
		
		PoliceMan policepark=park;
		policepark.canCatchCriminal();
		policepark.canSearch();
		
		Chef chefPark=park;
		chefPark.makePizza();
		chefPark.makeSpaghetti();
		//인터페이스는 변수가 없으니깐 생성자를 넣지 못한다.!!
		//추상클래스에서는 생성자 변수를 넣은건 어거지로 넣은거다!!!
	}

}
