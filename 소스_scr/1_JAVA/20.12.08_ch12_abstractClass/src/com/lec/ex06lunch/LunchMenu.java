package com.lec.ex06lunch;
//Child1 c = new Child1(300,1000,100,300,800,350)
//Child2 c = new Child1(300,1000,100,300,800,350)

public abstract class LunchMenu {
	private int rice;       //�Ұ�(1�δ�
	private int bulgogi;    //�Ұ�Ⱚ(1�δ�
	private int soup;       //����� ��(1�δ�
	private int banana;     //�ٳ�����(1�δ�
	private int milk;        //������(1�δ�
	private int almond;     //�Ƹ�尪(1�δ�
	//������ ������
	//public LunchMenu() {}
	public LunchMenu(int rice, int bulgogi, int soup, int banana, int milk, int almond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.soup = soup;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	//�Ĵ� ����ϴ� �޼ҵ�� �߻�޼ҵ��
	public abstract int calcuate();
	
	
	//getter��
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
