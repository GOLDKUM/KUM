package strategy2.modularization;

import strategy2.component.*;

public class Accent extends Car {
	public Accent() {
		setEngine(new EngineLow());
		setKm(new Km20());
		setFuel(new FuelDiesel());	
	}
	@Override
	public void shape() {
		System.out.println("¿¢¼¾Æ®");
		super.shape();
	}

}
