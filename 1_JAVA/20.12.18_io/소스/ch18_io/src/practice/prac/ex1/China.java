//2020/12/18/Kyoung-yong,Kum
package practice.prac.ex1;

public class China {
	private int age;
	private int height;
	private int weight;
	private String tel;
	
	public China(int age, int height, int weight, String tel) {
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.tel=tel;
	}

	public China(int age, int height, int weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public China(int age, int height) {
		super();
		this.age = age;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
