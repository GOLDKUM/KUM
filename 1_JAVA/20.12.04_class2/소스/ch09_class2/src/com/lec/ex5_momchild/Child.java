package com.lec.ex5_momchild;
//Child child1=new Child("ù° �ʶ���")
//child1.takeMoney(100);�����Ϸ��� 
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
			System.out.println(name+"��"+"�������� ����������"+momPouch.money);
		}
		else {
			System.out.println(name+"�� ���� �� ����. ���� ���� ����"+
		                            momPouch.money);
		}
		
	}

}
