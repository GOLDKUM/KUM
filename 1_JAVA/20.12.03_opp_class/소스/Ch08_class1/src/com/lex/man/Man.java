package com.lex.man;

//Mac kim = new Man(20,170,60,"010-9999-9999");
//Mac kim = new Man(20,170,60);
//Mac kim = new Man(20,"010-9999-9999");xxxx이것안됨 20은int값 숫자는 String값이 쓸수있지만 하나만 쓸수있음  
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

	// BMI지수를 반환하는 메소드
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
	// 01099999999 string을 안하면 문자로 인식하여 앞에 0 숫자를 없애버림
	// 매개 변수가 없기 떄문에 매개변수 없을떄도 상황대처를 할수있는 방법을 만들어줘야함 .

}
