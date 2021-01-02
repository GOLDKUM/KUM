//2020/12/21/Kyoung-yong,Kum
package com.lec.ex3_threadN_object1;

public class TreaadExTextMain {
	public static void main(String[] args) {
		//작벙ㅂ갹채 1개 쓰레드 공유
		Runnable target = new ThreadEx();
		Thread t1 = new Thread(target, "A");
		Thread t2 = new Thread(target, "B");
		t2.start();
		t1.start();
//		t2.start();
		System.out.println("main 함수 끝");
		//결과값을 보면 공통된 변수 num은 같이 공유한다! 
		
	}

}
