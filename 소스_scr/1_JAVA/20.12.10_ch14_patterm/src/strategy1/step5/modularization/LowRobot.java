package strategy1.step5.modularization;

import strategy1.step4.component.*;

public class LowRobot extends Robot {
	
	LowRobot() {
//		fly = new FlyNo();
//		missile = new MissileNo();
//		knife = new KnifeNo();
		setFly(new FlyNo());// 2번   1번2번 중에 둘중에 하나 하면되요
		setMissile(new MissileNo());
        setKnife(new KnifeNo());
	}

	@Override
	public void shape() {
		System.out.println(
				"LowRobot은 팔,다리,머리,몸통으로 이루어져 있다.");
	}
	
	
	
}
