package com.lec.ex08robot;

public class TestMain {
	public static void main(String[] args) {
		DanceRobot aRobot= new DanceRobot();
		SingRobot bRobot= new SingRobot();
		DrawRobot cRobot= new DrawRobot();
		RobotOrder order= new RobotOrder();
		order.action(aRobot);
		order.action(bRobot);
		
		Robot[] robots= {aRobot,bRobot,cRobot};
		for (Robot robot :robots) {
			order.action(robot);
		}
	}

}
