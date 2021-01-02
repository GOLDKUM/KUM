package strategy1.step5.modularization;

import strategy1.step4.component.*;
// 컨트롤 시프트 o
public  class StandardRobot extends Robot {
	
	StandardRobot(){
//		fly      = new FlyNo();
//		missile  = new MissileYes();
//		knife    = new KnifeWood();
		setFly(new FlyNo());// 2번   1번2번 중에 둘중에 하나 하면되요
		setMissile(new MissileYes());
        setKnife(new KnifeWood());
	}
	@Override
	public void shape() {
		System.out.println(
				"StandardRobot은 팔,다리,머리,몸통으로 이루어져 있다.");
		
	}
	
	

}
