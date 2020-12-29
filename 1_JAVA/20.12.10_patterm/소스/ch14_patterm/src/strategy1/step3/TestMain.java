package strategy1.step3;

public class TestMain {
	public static void main(String[] args) {
		SuperRobot superRobot   = new SuperRobot();
		StandardRobot standarRobot = new StandardRobot() ;
		LowRobot lowRobot       = new LowRobot();
		Robot[]robots= {superRobot,standarRobot,lowRobot};
		for(Robot robot: robots) {
			robot.shape();
			robot.actionWalk();
			robot.actionRun();
			robot.actionFly();
			robot.actionMissile();
			robot.actionKnife();
			
			
			
			
//			if(robot instanceof SuperRobot) {
//				SuperRobot tempRobot = (SuperRobot)robot;
//				tempRobot.actionFly();
//				tempRobot.actionMissile();
//				tempRobot.actionKnife();
////				((SuperRobot)robot).actionFly();
//			}else if(robot instanceof StandardRobot) {
//				StandardRobot tempRobot=(StandardRobot)robot;
//				tempRobot.actionFly();
//				tempRobot.actionMissle();
//				tempRobot.actionKnife();
//			}else if(robot instanceof LowRobot) {
//				LowRobot tempRobot = (LowRobot)robot;
//				tempRobot.actionFly();
//				tempRobot.actionMissile();
//				tempRobot.actionKnife();
//			}
			
			//형변환은 함부로 하지말기!
			
		}
//		superRobot.shape();
//		superRobot.actionWalk();
//		superRobot.actionRun();
//		superRobot.actionFly();
//		superRobot.actionMissile();
//		superRobot.actionKnife();
//		
//		standarRobot.shape();
//		standarRobot.actionWalk();
//		standarRobot.actionRun();
//		standarRobot.actionFly();
//		standarRobot.actionMissle();
//		standarRobot.actionKnife();
//		
//		lowRobot.shape();
//		lowRobot.actionWalk();
//		lowRobot.actionRun();
//		lowRobot.actionFly();
//		lowRobot.actionMissile();
//		lowRobot.actionKnife();
 	}

}
