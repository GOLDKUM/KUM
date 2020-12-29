package com.lex.ex;

public class Q3 {
	public static void main(String[] args) {
		int money = 2680;
		int[] coinUnit = { 500, 100, 50, 10 };
	
		
		for (int coin : coinUnit) {
			System.out.print(coin + "원 짜리는" + money / coin + "개. ");
			money %= coin;// money = money%coinUnit[i];
		}// for확장편!!  coin = coinUnit	
		
//		for(int i=0 ; i<coinUnit.length ; i++) {
//			System.out.print(
//		coinUnit[i]+"원 짜리는 "+ (money/coinUnit[i]) +"개 ");
//			money %= coinUnit[i]; //money = money%coinUnit[i];
//		}

	}

}
