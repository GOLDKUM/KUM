package strategy1.step5.modularization;

import strategy1.step4.component.*;  //*�ϸ� ��� �� ���ü�����!!

//�������� . �̻��Ͻ�. ��������
public class SuperRobot extends Robot {
	
	
	
   //������ �Լ� ȣ��
	public SuperRobot() {
		//��ǰ�����
//		fly = new FlyYes();   //1��
//		missile = new MissileYes();
//		knife   = new KnifeLazer();
      
        setFly(new FlyNo());// 2��   1��2�� �߿� ���߿� �ϳ� �ϸ�ǿ�
		setMissile(new MissileNo());
        setKnife(new KnifeNo());
		
	}
	@Override
		public void shape() {
			System.out.println("SuperRobot�� ��,�ٸ�,�Ӹ�,�������� �̷���� �ִ�.");
		}
	
}
