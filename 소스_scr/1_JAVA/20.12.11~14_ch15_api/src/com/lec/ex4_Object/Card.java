//2020-12-15 ⒦금경용
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
		return "카드모양"+kind+num;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null&& obj instanceof Card) {
			return kind==((Card)obj).kind;	
		}if(obj!=null&& obj instanceof Card) {
			return num==((Card)obj).num;	
		} //안써졌던 이유는 Card 형태를 마추지 않았기떄문에 
		//뒤에서 찾을수 없었음!
		
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
