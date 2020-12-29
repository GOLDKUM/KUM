package com.lec.ex06lunch;
//Child1 c = new Child1(300,1000,100,300,800,350)
//Child2 c = new Child1(300,1000,100,300,800,350)

public abstract class LunchMenu {
	private int rice;       //쌀값(1인당
	private int bulgogi;    //불고기값(1인당
	private int soup;       //국재료 값(1인당
	private int banana;     //바나나값(1인당
	private int milk;        //우유값(1인당
	private int almond;     //아몬드값(1인당
	//밑으로 생성자
	//public LunchMenu() {}
	public LunchMenu(int rice, int bulgogi, int soup, int banana, int milk, int almond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.soup = soup;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	//식대 계산하는 메소드는 추상메소드로
	public abstract int calcuate();
	
	
	//getter들
	public int getRice() {
		return rice;
	}
	public int getBulgogi() {
		return bulgogi;
	}
	public int getSoup() {
		return soup;
	}
	public int getBanana() {
		return banana;
	}
	public int getMilk() {
		return milk;
	}
	public int getAlmond() {
		return almond;
	}
	
	

}
