package com.lec.ex08;

public class TestMain {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		Grandchild grandchild = new Grandchild();
		System.out.println("parent의 p : "+ parent.getP()); //가능
		System.out.println("child1.p : "+child1.getP()); //가능
		System.out.println(child1.getC1()); //가능
		System.out.println(child2.getP()); //가능
		//System.out.println(child2.getC1()); //불가능
		System.out.println(child2.getC2()); //가능
		System.out.println(grandchild.getP());
		System.out.println(grandchild.getC1());
		System.out.println(grandchild.getGc());
		//System.out.println(grandchild.getC2()); //불가능

	}
}
