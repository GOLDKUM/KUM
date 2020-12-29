package strategy2.modularization;

import strategy2.component.FuelHybrid;
import strategy2.component.Km20;

public class TestMain {
	public static void main(String[] args) {
		Car genesis= new Genesis();
		Car sonata = new Sonata();
		Accent accent = new Accent();
		System.out.println("================================");
		Car[] cars = {genesis,sonata,accent};
		for(Car car: cars) {
			car.shape();
			car.drive();
			car.isEngine();
			car.isKm();
			car.isFuel();
			System.out.println("-----------------------------");
		}//FOR	
		System.out.println("=================================");
		System.out.println("소나타의 연료를 하이브리드로, 연비를20km/l");
		sonata.setFuel(new FuelHybrid());//연료 업그레이드
		sonata.setKm(new Km20());
		for(Car car: cars) {
			car.shape();
			car.drive();
			car.isEngine();
			car.isKm();
			car.isFuel();
		}//for문 
		
	}//main
}//class
