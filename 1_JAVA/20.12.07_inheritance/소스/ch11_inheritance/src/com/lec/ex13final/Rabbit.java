package com.lec.ex13final;

public class Rabbit extends Animal{
	@Override
	public void running() {
		speed+=30;
		System.out.println("마구 뛰어요. 현재속도:"+speed);
		
		
	}

}
