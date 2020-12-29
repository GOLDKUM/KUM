package com.lec.ex5_momchild;

public class ChildTestMain {
	public static void main(String[] args) {
		Child child1 = new Child("첫쨰 똘만이");
		Child child2 = new Child("둘쨰 갑돌이");
		Child child3 = new Child("셋쨰 똘순이");
		child1.takemoney(1000);
		child1.takemoney(1000);
		child2.takemoney(1000);
		child3.takemoney(1000);
		System.out.println("첫쨰 엄마 지갑"+child1.momPouch.money);
		System.out.println("둘쨰 엄마 지갑"+child2.momPouch.money);
		System.out.println("셋째 엄마 지갑"+child3.momPouch.money);
		System.out.println("static 엄마 지갑: "+Child.momPouch.money);
	}
}
