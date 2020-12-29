package com.lex.man;

//Mac kim = new Man(20,170,60,"010-9999-9999");
//Mac kim = new Man(20,170,60);
//Mac kim = new Man(20,"010-9999-9999");xxxx�̰;ȵ� 20��int�� ���ڴ� String���� ���������� �ϳ��� ��������  
public class Man {
	private int age;
	private int height;
	private int weight;
	private String tel;

	public Man(int age, int height, int weight, String tel) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.tel = tel;
	}

	public Man(int age, int height, int weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Man(int age, String tel) {
		this.age = age;
		this.tel = tel;
	}

	// BMI������ ��ȯ�ϴ� �޼ҵ�
	public double calculateBMI() {
		double result = weight / ((height * 0.01) * (height * 0.01));
		return result;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel(String tel) {
		return tel;
	}

	// public Man() {}
	// 01099999999 string�� ���ϸ� ���ڷ� �ν��Ͽ� �տ� 0 ���ڸ� ���ֹ���
	// �Ű� ������ ���� ������ �Ű����� �������� ��Ȳ��ó�� �Ҽ��ִ� ����� ���������� .

}
