package com.lex.squre;
//Squre s1 = new Squre() �̷��� ������ ����
//Squre s1 = new Squre(10<-�Ű�����);�������� ����
//Scanner sc = new Scanner(System.in)
public class Squre {
	private int side;
	public Squre() {// ����Ʈ ������(�Ű����� ���� ������=>������ �����ε�)
		System.out.println("�Ű����� ���� ������ ȣ���");
	}

	public Squre(int side) {// �Ű����� �ִ� ������ =>
		this.side=side;
		System.out.println("�Ű� ���� �ִ� ������ ȣ���");
	}
	public int area() {
		return side*side;
	}
	
	public int getSide() {   //~.getSide()
		return side;
	}
	//~.setSide(10)
	public void setSide(int side) {
		this.side = side;
	}
	
}
