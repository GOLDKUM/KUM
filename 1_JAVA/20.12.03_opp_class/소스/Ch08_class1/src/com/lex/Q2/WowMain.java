package com.lex.Q2;

public class WowMain {
	public static void main(String[] args) {
		Wow box = new Wow(5,6,10); // 3���� �ڽ�
		Wow rect = new Wow(10,5);  // 2���� �׸�
		box.calNsetVolume();
		rect.calNsetVolume();
		System.out.println("�ڽ� ���� : "+box.getVolume());
		System.out.println("rect ���� : "+rect.getVolume());
	}//main

}
