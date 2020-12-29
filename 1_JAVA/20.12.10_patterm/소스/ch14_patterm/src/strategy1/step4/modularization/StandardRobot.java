package strategy1.step4.modularization;

import strategy1.step4.component.*;
// 컨트롤 시프트 o
public class StandardRobot extends Robot {
	private FlyImpl     fly;
	private MissileImpl missile;
	private KnifeImpl   knife;
	public StandardRobot() {
		fly      = new FlyNo();
		missile  = new MissileYes();
		knife    = new KnifeWood();
//		setFly(new FlyNo());// 2번   1번2번 중에 둘중에 하나 하면되요
//		setMissile(new MissileYes());
//      setKnife(new KnifeWood());
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
	public FlyImpl getFly() {
		return fly;
	}
	public void setFly(FlyImpl fly) {
		this.fly = fly;
	}
	public MissileImpl getMissile() {
		return missile;
	}
	public void setMissile(MissileImpl missile) {
		this.missile = missile;
	}
	public KnifeImpl getKnife() {
		return knife;
	}
	public void setKnife(KnifeImpl knife) {
		this.knife = knife;
	}

}
