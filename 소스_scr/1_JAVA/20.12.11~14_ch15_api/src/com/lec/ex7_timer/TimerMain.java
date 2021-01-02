//2020-12-15 ⒦금경용
package com.lec.ex7_timer;

import java.util.Timer;

public class TimerMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("===시작===");
		Timer timer = new Timer(true);//true:프로그램 종료되면 timer종료 // true을 안넣으면 계속 실행됨
		TimerTaskEx1 task1 = new TimerTaskEx1();//작업의 객체
		TimerTaskEx2 task2 = new TimerTaskEx2();//작업의 객체 
		timer.schedule(task1, 2000);//2000밀리세컨트 =2초후에 한번실행
		timer.schedule(task2, 1000,1000);//1초후부터 1초마다 실행 
		Thread.sleep(10000); //10초대기 대기를 하지않으면 바로 끝나버림 
		System.out.println("=====끝=====");
	}

}
