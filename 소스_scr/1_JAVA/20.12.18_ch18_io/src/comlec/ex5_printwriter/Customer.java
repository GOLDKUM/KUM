//2020/12/18/Kyoung-yong,Kum
package comlec.ex5_printwriter;

public class Customer {
	private String name;
	private String phone;
	private String address;
	private String birthday;

	public Customer() {
	}

	public Customer(String name, String phone, String address, String birthday) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
	}

	@Override
	public String toString() {

		return "[捞抚]" + name + "\t" + "[傈锅]" + phone + "\t" + "[林家]" + address + "\t" + "[积老]" + birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
