package com.lex.Q2;

public class WowMain {
	public static void main(String[] args) {
		Wow box = new Wow(5,6,10); // 3차원 박스
		Wow rect = new Wow(10,5);  // 2차원 네모
		box.calNsetVolume();
		rect.calNsetVolume();
		System.out.println("박스 부피 : "+box.getVolume());
		System.out.println("rect 넓이 : "+rect.getVolume());
	}//main

}
