package com.lex.ex;

public class Ex01 {
	public static void main(String[] args) {
		int i = 10; // ������ ����(����Ȯ��)�� �ʱ�ȭ(�����Է�)
		int[] iArr = { 10, 20, 30, 40, 50 };// �迭��������� �ʱ�ȭ ���ÿ�
		iArr[1] = 200; // �迭�� index�� ����(index:0~4)
		for (int idx = 0; idx <= 4; ++idx) {
			System.out.println(iArr[idx]);
		}
		
		int[] iArr2 = new int[5]; //2.�迭 ���� ����� �迭�޸� ���� Ȯ��
		for(int idx=0 ; idx<iArr2.length ; idx++) {//�Ϲ� for��
			System.out.println(idx +"������:"+iArr2[idx]);
		}
		int[] iArr3;//3.�迭 ���� ����
		iArr3 = new int [5];//00000
		for(int idx = 0 ; idx <iArr.length ; idx++) {
			iArr3[idx] = idx+1;
		}
		//for(int temp : iArr3){Ȯ�� for��
		
		for(int temp : iArr3) {//Ȯ�� for��
			System.out.println(temp);
			
		}
		for(int idx = 0 ; idx <iArr.length ; idx++) {
			iArr3[idx] = 10;//�Ϲ� for������ �� ���� (0)
		}
		
		
		
		
		
//		System.out.println(iArr[0]);
//		System.out.println(iArr[1]);
//		System.out.println(iArr[2]);
//		System.out.println(iArr[3]);
//		System.out.println(iArr[4]);
//		
	}

}
