//2020/12/18/Kyoung-yong,Kum
package practice.prac.ex1;

public class Product {
	private String name;
	private String price;
	private String ps;

	public Product() {}
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(String name, String price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, String price, String ps) {
		this.name = name;
		this.price = price;
		this.ps = ps;
	}
	

	public void kum() {
		System.out.println("±Ý");
	}
	public void kyoung() {
		System.out.println("°æ");
	}
	public void yong() {
		System.out.println("¿ë");
	}
	
	

	@Override
	public String toString() {
		return name + "\t" + price + "\t" + ps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

}
