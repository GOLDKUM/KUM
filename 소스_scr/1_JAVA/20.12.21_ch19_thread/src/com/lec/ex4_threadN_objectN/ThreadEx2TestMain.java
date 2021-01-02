//2020/12/21/Kyoung-yong,Kum
package com.lec.ex4_threadN_objectN;

public class ThreadEx2TestMain {
	public static void main(String[] args) {

		Thread t1 = new ThreadEx2("A");

		Thread t2 =new ThreadEx2("B");
		t1.start();
		t2.start();
		
	}

}
