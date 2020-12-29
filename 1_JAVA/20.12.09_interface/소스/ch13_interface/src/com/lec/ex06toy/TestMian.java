package com.lec.ex06toy;

public class TestMian {

	public static void main(String[] args) {
		IToy[] toy = {new Pooh(),
				new MazingerToy(),
				new AirplaneToy()};
		for(IToy t: toy) {
			//t객체의 클래스 이름 출력
			System.out.println(t.getClass().getName());
			//t.toString()호출
			System.out.println(t);
			System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
		}

	}

}
