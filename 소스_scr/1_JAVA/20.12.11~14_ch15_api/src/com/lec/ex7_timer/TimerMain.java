//2020-12-15 �ױݰ��
package com.lec.ex7_timer;

import java.util.Timer;

public class TimerMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("===����===");
		Timer timer = new Timer(true);//true:���α׷� ����Ǹ� timer���� // true�� �ȳ����� ��� �����
		TimerTaskEx1 task1 = new TimerTaskEx1();//�۾��� ��ü
		TimerTaskEx2 task2 = new TimerTaskEx2();//�۾��� ��ü 
		timer.schedule(task1, 2000);//2000�и�����Ʈ =2���Ŀ� �ѹ�����
		timer.schedule(task2, 1000,1000);//1���ĺ��� 1�ʸ��� ���� 
		Thread.sleep(10000); //10�ʴ�� ��⸦ ���������� �ٷ� �������� 
		System.out.println("=====��=====");
	}

}
