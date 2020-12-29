package strategy1.step4.modularization;

import strategy1.step4.component.*;  //*하면 모두 다 들어올수있음!!

//날수있음 . 미사일쏨. 레이저검
public class SuperRobot extends Robot {
	private FlyImpl       fly;
	private MissileImpl  missile;
	private KnifeImpl     knife;
	
	
   //생성자 함수 호출
	public SuperRobot() {
		//부품들생성
		fly = new FlyYes();   //1번
		missile = new MissileYes();
		knife   = new KnifeLazer();
		
		
//		setFly(new FlyYes());// 2번   1번2번 중에 둘중에 하나 하면되요
//		setMissile(new MissileYes());
//      setKnife(new knifeLazer());
		
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
	public void setMissle(MissileImpl missile) {
		this.missile = missile;
	}
	public void setKnife(KnifeImpl knife) {
		this.knife = knife;
	}

}
