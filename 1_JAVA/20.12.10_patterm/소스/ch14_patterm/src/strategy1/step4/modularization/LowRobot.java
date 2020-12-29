package strategy1.step4.modularization;

import strategy1.step4.component.*;

public class LowRobot extends Robot {
	private FlyImpl fly;
	private MissileImpl missile;
	private KnifeImpl knife;
	public LowRobot() {
		fly = new FlyNo();
		missile = new MissileNo();
		knife = new KnifeNo();
//		setFly(new FlyNo());// 2번   1번2번 중에 둘중에 하나 하면되요
//		setMissile(new MissileNo());
//      setKnife(new KnifeNo());
	}
	@Override
	public void actionFly() {
		fly.fly();
		
	}
	@Override
	public void actionMissile() {
		missile.missile();
		
	}
	@Override
	public void actionKnife() {
		knife.kinfe();
		
	}
	public void setFly(FlyImpl fly) {
		this.fly = fly;
	}
	public void setMissile(MissileImpl missile) {
		this.missile = missile;
	}
	public void setKnife(KnifeImpl knife) {
		this.knife = knife;
	}
	
}
