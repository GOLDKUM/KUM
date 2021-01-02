package com.lec.ex09_person;

public class TestMain {
	public static void main(String[] args) {
		Person papa = new Person("아빠곰","뚱뚱해");
		Person mom = new Person("엄마곰","날씬해");
		papa.intro();
		mom.intro();
		System.out.println("========================");
		Baby child1 = new Baby();
		child1.setName("아기곰1");
		child1.setCharacter("뭐 좀 귀여워");
		child1.intro();
		Baby child2 = new Baby("아기곰2","귀여워");
		child2.cry();
	}
}
