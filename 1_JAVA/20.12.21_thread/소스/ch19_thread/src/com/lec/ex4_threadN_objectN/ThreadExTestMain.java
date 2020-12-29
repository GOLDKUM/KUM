//2020/12/21/Kyoung-yong,Kum
package com.lec.ex4_threadN_objectN;

public class ThreadExTestMain {
	public static void main(String[] args) {
		Runnable target1 = new ThreadEx();//target1.num
		Runnable target2 = new ThreadEx();//target2.num은 공유하지 않음~! 
		Thread t1= new Thread(target1,"A");
		Thread t2= new Thread(target2,"B");
		t1.start();
		t2.start();
		
		
	}

}
