package com.lec.ex;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		
		Car myPorsche = new Car ();
		Car yourporsche = new Car();
		myPorsche.drive();   //����ϴ����� 
		yourporsche.drive();
		myPorsche.park();
		yourporsche.race();
		myPorsche.setColor("red");//myPorsche.color="red";
		System.out.println("�� ������ ����: "+myPorsche.getColor());
		System.out.println("�� ������ ����: "+yourporsche.getColor());
		System.out.println("�� ������ ��ⷮ:"+myPorsche.getCc());
		
		
		
	}
}
