package com.lex.ex_janmuri; 
//class랑 main이랑 무조건 나눠 인터넷이 이렇게 되어있는 이유는 한눈에 볼수있게 할수있게 위해 그냥 올리기위한것뿐임 
//이딴 클래스를 버려라 
class PersonInfo {
	private String name;
	private int age;
	private char gender;// 성별 '남','여'

	public PersonInfo() {
	} // 생성자가 없을 경우에만

	public PersonInfo(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}// 생성자//윗 부분은 속성임

	public void print() {
		System.out.println("이름=" + name + "\t나이=" + age + "\t성별=" + gender);
	}
	public String inforString() {
		String result = "이름=" + name + "\t나이=" + age + "\t성별=" + gender;
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
		PersonInfo[]person= {new PersonInfo("홍길동",20,'남'),
				new PersonInfo("홍길동",22,'여'),
				new PersonInfo()};
		person[2].setName("홍길숙");
		person[2].setAge(21);
		person[2].setGender('여');
		for(PersonInfo p : person) {
			p.print();
			System.out.println(p.inforString());
//			위에는 확장구문

//		for(int i=0; i<person.length;i++) {
//			System.out.println(person[i].inforString());
//			person[i].print();
		}
	}//main
			
//객체 배열로 해볼것 
//		PersonInfo p = new PersonInfo ("홍길동",22,'남');
//		p.print();
//		System.out.println(p.inforString());
}//class//함수값이라고 생각하면됨 메소드!
//


