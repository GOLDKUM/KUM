package com.lec.loop;

import java.util.Scanner;

public class Ex10dowhile_ramdonNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lotte = (int) (Math.random() * 45) + 1; //��ǻ�� �ζ� ����  
		int su; //=����ڿ��� �Է¹��� ���� �����ϴ� ���� 
		do {
			System.out.print("�ζ� ��ȣ �Ѱ��� �˾Ƹ��� ������");
			su=scanner.nextInt();
			if(su>lotte) {
				System.out.println(su+"���� �������� �����ϼ���");
			}else if(su<lotte) {
				System.out.println(su+"���� ū���� �����ϼ���");
			}
		}while(su!=lotte);
		System.out.println("�������� ���߼̽��ϴ�.");

//		// 1�ܰ� ��ǻ�Ͱ� �ƹ��ų� ���ڸ� ����
//		System.out.println(Math.random());// 0~1�̸��� ���� �Ǽ�
//		System.out.println(Math.random() * 45);// 0�̻� 45�̸��� �����Ǽ�
//		System.out.println((int) (Math.random() * 45));// 0~44�̻��� ���� //���⿡ ��Ʈ���� �ֱ⶧���� 
//		System.out.println((int) (Math.random() * 45) + 1);// 1~45�̻��� ����
}

}
