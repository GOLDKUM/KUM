package com.lec.ex08robot;

public class RobotOrder {
	public void action(Robot robot) {
		if(robot instanceof DanceRobot) {
			((DanceRobot)robot).dance();
			
//			DanceRobot dRobot=(DanceRobot)robot;
//			dRobot.dance();    위에것과 같은발
			
		}else if(robot instanceof SingRobot) {
			((SingRobot)robot).sing();
			
			
		}else if(robot instanceof DrawRobot) {
			((DrawRobot)robot).draw();
//			DrawRobot dRobot=(DrawRobot)robot;
//			dRobot.draw(); 위에것과 같은말 
		}
		
		
		
	}

}
