//2020-12-15 �ױݰ��
package com.lec.ex5_scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();//\n
		System.out.println("�Է��Ͻ� ���̴�"+age);
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();//"\nȫ�浿"����� �� �׸��� \n����
		//���ۿ� ó�� ������ \n�� �����ϰ� whiteSpace������ ������ ����
		
		System.out.println("�Է��Ͻ� �̸���:"+name);
		System.out.print("�ּҸ� �Է��ϼ���");
		
		sc.nextLine();//���� ����� (\n������) 
		String address = sc.nextLine();//���ۿ� \n�� ������ �ձ��� 
		System.out.println("�Է��Ͻ� �ּҴ�"+address);		
		System.out.println("==========���α׷� ��=========");
	}
	

}
