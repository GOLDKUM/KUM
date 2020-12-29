package com.lec.ex06lunch;

public class Child2 extends LunchMenu {

	public Child2(int rice, int bulgogi, int soup, int banana, int milk, int almond) {
		super(rice, bulgogi, soup, banana, milk, almond);
		
	}
	@Override
	public int calcuate() {
		return getRice()+getBulgogi()+getSoup()+getMilk();
	}

}
