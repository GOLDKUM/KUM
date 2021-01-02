//2020.12.16 ,yong-kyoung, kum 
package com.lec.ex3_exceptionExs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {
	private String name;
	private String tel;
	private Date enterDate;
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
		enterDate = new Date();
	}
	@Override
	public String toString() {
		String post = tel.substring(tel.lastIndexOf("-")+1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 친구");
		return "Friend [name=" + name + 
			    ", tel=***-****-" + post +":"+ sdf.format(enterDate)+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
}
