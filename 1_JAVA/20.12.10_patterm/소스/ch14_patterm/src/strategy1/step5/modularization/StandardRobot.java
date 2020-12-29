package strategy1.step5.modularization;

import strategy1.step4.component.*;
// ��Ʈ�� ����Ʈ o
public  class StandardRobot extends Robot {
	
	StandardRobot(){
//		fly      = new FlyNo();
//		missile  = new MissileYes();
//		knife    = new KnifeWood();
		setFly(new FlyNo());// 2��   1��2�� �߿� ���߿� �ϳ� �ϸ�ǿ�
		setMissile(new MissileYes());
        setKnife(new KnifeWood());
	}
	@Override
	public void shape() {
		System.out.println(
				"StandardRobot�� ��,�ٸ�,�Ӹ�,�������� �̷���� �ִ�.");
		
	}
	
	

}
