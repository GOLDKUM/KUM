//2020-12-15 �ױݰ��
package com.lec.ex4_Object;

public class Card {
	private char kind;
	private int num;
	
	
	public Card(char kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "ī����"+kind+num;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&& obj instanceof Card) {
			return kind==((Card)obj).kind;	
		}if(obj!=null&& obj instanceof Card) {
			return num==((Card)obj).num;	
		} //�Ƚ����� ������ Card ���¸� ������ �ʾұ⋚���� 
		//�ڿ��� ã���� ������!
		
		return false;
	}
	
	public char getKind() {
		return kind;
	}
	public void setKind(char kind) {
		this.kind = kind;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
