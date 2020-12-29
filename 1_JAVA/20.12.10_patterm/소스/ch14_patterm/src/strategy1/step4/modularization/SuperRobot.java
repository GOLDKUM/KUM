package strategy1.step4.modularization;

import strategy1.step4.component.*;  //*�ϸ� ��� �� ���ü�����!!

//�������� . �̻��Ͻ�. ��������
public class SuperRobot extends Robot {
	private FlyImpl       fly;
	private MissileImpl  missile;
	private KnifeImpl     knife;
	
	
   //������ �Լ� ȣ��
	public SuperRobot() {
		//��ǰ�����
		fly = new FlyYes();   //1��
		missile = new MissileYes();
		knife   = new KnifeLazer();
		
		
//		setFly(new FlyYes());// 2��   1��2�� �߿� ���߿� �ϳ� �ϸ�ǿ�
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
