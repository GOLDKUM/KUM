//2020/12/21/Kyoung-yong,Kum
package com.lec.ex2_thread;

public class TargetExTestMain {
	public static void main(String[] args) {
		//쓰레드 생성 -target01.run()을 수행 
		Thread target01 = new TargetEx01();//매개변수떄문에 할수없다.
		target01.setName("A");
		
		//쓰레드 생성 -target02.run()을 수행 
		Thread target02 = new TargetEx02();
		target02.setName("B");
		target01.start();
		target02.start();
		for(int i=0;i<10;i++) {
			System.out.println("나는"+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		
	}

}
