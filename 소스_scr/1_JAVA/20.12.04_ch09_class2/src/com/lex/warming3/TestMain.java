package com.lex.warming3;

public class TestMain {
	public static void main(String[] args) {
		Person papa = new Person("�ƺ���","�׶���");
		Person mom = new Person("������","������");
		papa.intro();
		mom.intro();
		System.out.println("========================");
		Baby child1 = new Baby();
		child1.setName("�Ʊ��1");
		child1.setCharacter("�� �� �Ϳ���");
		System.out.println("============");
		child1.intro();
		System.out.println("==========");
		Baby child2 = new Baby("�Ʊ��2","�Ϳ���");
		child2.cry();
		System.out.println("==========");
	}
}
