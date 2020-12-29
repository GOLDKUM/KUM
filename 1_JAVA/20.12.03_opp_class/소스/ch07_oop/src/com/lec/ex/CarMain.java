package com.lec.ex;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		
		Car myPorsche = new Car ();
		Car yourporsche = new Car();
		myPorsche.drive();   //써야하는이유 
		yourporsche.drive();
		myPorsche.park();
		yourporsche.race();
		myPorsche.setColor("red");//myPorsche.color="red";
		System.out.println("내 포르쉐 색상: "+myPorsche.getColor());
		System.out.println("너 포르쉐 색상: "+yourporsche.getColor());
		System.out.println("내 포르쉐 배기량:"+myPorsche.getCc());
		
		
		
	}
}
