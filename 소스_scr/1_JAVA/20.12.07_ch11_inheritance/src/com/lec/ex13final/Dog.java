package com.lec.ex13final;
//final 클래스: 상속불가 
public final class Dog extends Animal {
	@Override
	public void running() {
		speed+=10;
		System.out.println("강아지가 뛰면서 꼬리를 흔들어요. 현속도:"+speed);
	}
	//위에 stop 앞에 final이 있기떄문에 오버라이드가 되지 않음 
	public void method() {
		System.out.println("method()");
	}
}
