package com.lec.ex07_super;
public class ChildClass extends ParentClass {
	private String cStr="자식클래스";
	public ChildClass() {
		System.out.println("자식 생성자");
	}
	@Override
	public void getMamiName() {
		// this.  ; 내 객체의
		// this() ; 생성자함수(현클래스의)
		// super. ; 부모의                 (아무데나 쓸 수 있음)
		// super() ; 부모클래스의 생성자 (반드시 맨 윗 줄에 씀)
		System.out.print("이쁜 아주 이쁜 ");
		super.getMamiName();
	}
	public String getcStr() {
		return cStr;
	}
	public void setcStr(String cStr) {
		this.cStr = cStr;
	}
}
