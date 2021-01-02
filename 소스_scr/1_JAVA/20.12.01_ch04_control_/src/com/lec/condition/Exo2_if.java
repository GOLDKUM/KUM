package com.lec.condition;

public class Exo2_if {
	public static void main(String[] args) {
		int seoulLunchPrice = 7000;
		if(seoulLunchPrice>7000) {
			System.out.println("서울 밥 값 비싸네");
		}else if(seoulLunchPrice>=6000) {
			System.out.println("뭐 재료값 만큼이네");
		}else if(seoulLunchPrice>=4000) {
			System.out.println("서울 밥값 괜찮네");
			
		}else {
			System.out.println("어 식당 주인은 괜찮을까");
		}

	}
}
