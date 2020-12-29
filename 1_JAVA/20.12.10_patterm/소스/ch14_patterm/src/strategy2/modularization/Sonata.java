package strategy2.modularization;

import strategy2.component.*;

public class Sonata extends Car {
	public Sonata() {
		setEngine(new EngineMid());
		setKm(new Km15());
		setFuel(new FuelGasoline());
	}
	@Override
	public void shape() {
		System.out.println("¼Ò³ªÅ¸");
		super.shape();
	}

}
