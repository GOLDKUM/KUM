//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

//�پ��� String�� method��
public class Ex02 {
	public static void main(String[] args) {
		String str1 = "abcXabc";
		String str2 = new String("ABCXabc");
		String str3 = "          ja  va";
		System.out.println("1." + str1.concat(str2));// abcXabcABCXabc
		System.out.println("2." + str1.substring(3));// 3�������� ������ abcXabc a�� 0������
		System.out.println("3." + str1.substring(3, 5));// 3�������� 5�����ձ��� 5���� �������� ����
		System.out.println("4." + str1.length());// ���ڱ��� 7�� ��������
		System.out.println("5." + str1.toUpperCase());// �빮�ڷθ� ���Ͷ�!
		System.out.println("6." + str2.toLowerCase());// �ҹ��ڷ� ���Ͷ�!
		System.out.println("7." + str1.charAt(3));// 3 index��° �����ϳ�!
		System.out.println("8." + str1.indexOf("b"));// ùb�� �ִ� index
		System.out.println("9." + str1.indexOf("b", 3));// 3index���� ������ ùb�� index
		System.out.println("10." + str1.lastIndexOf("b"));// ������b index
		System.out.println("11." + str1.indexOf("z"));// ������ -1
		System.out.println("--." + str1.lastIndexOf("b"));// ������ -1
		System.out.println("12." + str1.equals(str2));// true | false ��ҹ��ڵ���
		System.out.println("13." + str1.equalsIgnoreCase(str2));// true | false ��ҹ��� ������ �ʰ� Ȯ���غ�
		System.out.println("14." + str3.trim());// �¿� space���� �¿쿡 �ִ� ���� ����
		System.out.println("15." + str1.replace('a', '�o'));// a(����)��ſ� �o���� �ٲ��
		System.out.println("16." + str1.replace("ab", "�ٲ�"));// ab��� �ٲ�� �ٲٴ� ��
		System.out.println("���� str:" + str1);// ���ڿ� �ִ� �����ʹ� �ٲ��� ����!
	}

}
