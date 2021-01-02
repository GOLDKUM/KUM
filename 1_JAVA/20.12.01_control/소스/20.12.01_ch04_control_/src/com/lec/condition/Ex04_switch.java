package com.lec.condition;

public class Ex04_switch {
	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("주사위 1"); 
		case 2:
			System.out.println("주사위2"); 
		case 3:
			System.out.println("주사위3"); 
		default :
			System.out.println("그외"); 
		}
	}
}
