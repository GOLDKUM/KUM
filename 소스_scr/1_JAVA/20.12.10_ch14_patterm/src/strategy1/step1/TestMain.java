package strategy1.step1;

public class TestMain {
	public static void main(String[] args) {
		SuperRobot superRobot   = new SuperRobot();
		StandardRobot standarRobot = new StandardRobot() ;
		LowRobot lowRobot       = new LowRobot();
		
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionKnife();
		
		standarRobot.shape();
		standarRobot.actionWalk();
		standarRobot.actionRun();
		standarRobot.actionFly();
		standarRobot.actionMissle();
		standarRobot.actionKnife();
		
		lowRobot.shape();
		lowRobot.actionWalk();
		lowRobot.actionRun();
		lowRobot.actionFly();
		lowRobot.actionMissile();
		lowRobot.actionKnife();
 	}

}
