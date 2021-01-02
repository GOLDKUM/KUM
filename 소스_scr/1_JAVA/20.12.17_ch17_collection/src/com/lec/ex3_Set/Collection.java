package com.lec.ex3_Set;

public class Collection {
	private String name;
	private String phone;
	private String address;
	
	
	public Collection() {};
	public Collection(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name+"\t"+phone+"\t"+address;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj!=null&& obj instanceof Collection) {
			boolean nameChk=name.equals(((Collection)obj).name);
			boolean phoneChk=phone == ((Collection)obj).phone;
			boolean addressChk=address == ((Collection)obj).address;
			return nameChk&&phoneChk&&addressChk;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return toString().hashCode();
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
	
	

}
