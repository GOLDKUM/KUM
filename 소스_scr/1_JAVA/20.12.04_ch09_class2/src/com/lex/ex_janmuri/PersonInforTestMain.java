package com.lex.ex_janmuri; 
//class�� main�̶� ������ ���� ���ͳ��� �̷��� �Ǿ��ִ� ������ �Ѵ��� �����ְ� �Ҽ��ְ� ���� �׳� �ø������Ѱͻ��� 
//�̵� Ŭ������ ������ 
class PersonInfo {
	private String name;
	private int age;
	private char gender;// ���� '��','��'

	public PersonInfo() {
	} // �����ڰ� ���� ��쿡��

	public PersonInfo(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}// ������//�� �κ��� �Ӽ���

	public void print() {
		System.out.println("�̸�=" + name + "\t����=" + age + "\t����=" + gender);
	}
	public String inforString() {
		String result = "�̸�=" + name + "\t����=" + age + "\t����=" + gender;
		return result;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}


public class PersonInforTestMain {
	public static void main(String[] args) {
		int[] iArr= {10,20,30};
		PersonInfo[]person= {new PersonInfo("ȫ�浿",20,'��'),
				new PersonInfo("ȫ�浿",22,'��'),
				new PersonInfo()};
		person[2].setName("ȫ���");
		person[2].setAge(21);
		person[2].setGender('��');
		for(PersonInfo p : person) {
			p.print();
			System.out.println(p.inforString());
//			������ Ȯ�屸��

//		for(int i=0; i<person.length;i++) {
//			System.out.println(person[i].inforString());
//			person[i].print();
		}
	}//main
			
//��ü �迭�� �غ��� 
//		PersonInfo p = new PersonInfo ("ȫ�浿",22,'��');
//		p.print();
//		System.out.println(p.inforString());
}//class//�Լ����̶�� �����ϸ�� �޼ҵ�!
//


