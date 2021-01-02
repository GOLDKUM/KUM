package com.lec.ex07_super;
public class TestMain {
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		System.out.println(obj.getcStr());
		System.out.println(obj.getpStr());
		obj.getPapaName();
		obj.getMamiName();
	}
}
