package strategy1.step5.modularization;

import strategy1.step4.component.*;

public class LowRobot extends Robot {
	
	LowRobot() {
//		fly = new FlyNo();
//		missile = new MissileNo();
//		knife = new KnifeNo();
		setFly(new FlyNo());// 2��   1��2�� �߿� ���߿� �ϳ� �ϸ�ǿ�
		setMissile(new MissileNo());
        setKnife(new KnifeNo());
	}

	@Override
	public void shape() {
		System.out.println(
				"LowRobot�� ��,�ٸ�,�Ӹ�,�������� �̷���� �ִ�.");
	}
	
	
	
}
