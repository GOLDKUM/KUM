package com.lec.ex01store;
//2ȣ��: ��ġ�-5,000 �δ��-5,000 �����-5,000 ���뱹-5,000  �����-����
public class StoreNum2 extends HeadQuarterStore {
	public StoreNum2(String name) {
		super(name);
	}
	// �������̵�(������) ; �θ�Ŭ������ �޼ҵ带 ������
	// �����ε�(�ߺ�����) ; �Ű������� ���� Ÿ������ ���� �̸��� �Լ��� �ߺ� ����
	@Override         
	public void bude() {
		System.out.println("�δ�� 5,000��");
	}
	@Override
	public void bibib() {
		System.out.println("����� 5,000��");
	}
	@Override
	public void gonggibab() {
		System.out.println("����� 0��. ����");
	}
	@Override
	public void kimchi() {
		System.out.println("��ġ� 5,000��");
		
	}
	@Override
	public void sunde() {
		System.out.println("���� 5,000��");
		
	}
}
