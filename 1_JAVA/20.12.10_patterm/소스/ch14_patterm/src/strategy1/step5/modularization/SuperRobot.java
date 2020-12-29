package strategy1.step5.modularization;

import strategy1.step4.component.*;  //*하면 모두 다 들어올수있음!!

//날수있음 . 미사일쏨. 레이저검
public class SuperRobot extends Robot {
	
	
	
   //생성자 함수 호출
	public SuperRobot() {
		//부품들생성
//		fly = new FlyYes();   //1번
//		missile = new MissileYes();
//		knife   = new KnifeLazer();
      
        setFly(new FlyNo());// 2번   1번2번 중에 둘중에 하나 하면되요
		setMissile(new MissileNo());
        setKnife(new KnifeNo());
		
	}
	@Override
		public void shape() {
			System.out.println("SuperRobot은 팔,다리,머리,몸통으로 이루어져 있다.");
		}
	
}
