package com.lex.ex3_accessTest;

public class AccessTest {
	private int privateMember; //���� Ŭ���� ��������
	int defaultMember;//����Ʈ ���� ��Ű���ȿ����� 
	protected int protectMember;//���� ��Ű���� ��ӹ��� ����Ŭ��������
	public int publicMember;// �ܺο��� �ƹ����� 
	public char[] protectedMember;
	private void privateMethod() {//���� Ŭ���� ��������
		System.out.println("private �޼ҵ� ȣ��");
	}
	void defaultMethod() {//���� ��Ű�������� 
		System.out.println("����Ʈ �޼ҵ� ȣ��");
	}
	protected void protectMethod() {
		System.out.println("protected �޼ҵ�ȣ��");
	}
	public void publicMethod() {
		System.out.println("public �޼ҵ�ȣ��");
	}
	public void protectedMember() {
		// TODO Auto-generated method stub
		
	}
}
