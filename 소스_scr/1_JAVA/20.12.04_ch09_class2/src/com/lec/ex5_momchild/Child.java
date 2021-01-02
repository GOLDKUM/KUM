package com.lec.ex5_momchild;
//Child child1=new Child("첫째 똘똘이")
//child1.takeMoney(100);실행하려고 
public class Child {
	private String name;
	static MomPouch momPouch= new MomPouch();
	public Child(String name) {
		this.name=name;
//		momPouch = new MomPouch();
	}
	public void takemoney(int money) {
		if(momPouch.money>=money) {
//			momPouch.money=momPouch.money - money;
			momPouch.money -= money;
			System.out.println(name+"가"+"가져가서 엄마지갑엔"+momPouch.money);
		}
		else {
			System.out.println(name+"가 돈을 못 받음. 현재 엄마 돈은"+
		                            momPouch.money);
		}
		
	}

}
