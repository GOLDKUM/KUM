package com.lec.ex5_momchild;

public class ChildTestMain {
	public static void main(String[] args) {
		Child child1 = new Child("ù�� �ʸ���");
		Child child2 = new Child("�Ѥ� ������");
		Child child3 = new Child("�¤� �ʼ���");
		child1.takemoney(1000);
		child1.takemoney(1000);
		child2.takemoney(1000);
		child3.takemoney(1000);
		System.out.println("ù�� ���� ����"+child1.momPouch.money);
		System.out.println("�Ѥ� ���� ����"+child2.momPouch.money);
		System.out.println("��° ���� ����"+child3.momPouch.money);
		System.out.println("static ���� ����: "+Child.momPouch.money);
	}
}
