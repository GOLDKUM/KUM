package com.lex.warming3;

public class Baby extends Person {
	public Baby() {System.out.println("�Ű����� ���� Baby������");}
	public Baby(String name, String character) {
		super(name, character); // �θ���� ������. �׻� ù ��ɾ�� ȣ��Ǿ�� �� 
		System.out.println("�Ű����� �ִ� Baby ������");
	}
	public void cry() {
		System.out.println("��������");
	}
	@Override
	public void intro() {
		System.out.println(getName()+"��(��) �Ʊ�� ������ ��� �Ұ��Ҳ�");
		super.intro();
	}

}
