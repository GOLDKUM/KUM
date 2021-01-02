//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_date {
	private String num;
	private String name;
	// private String part;
	private PartType part;
	private String enterDate;

	public Ex09_date() {
	};

	public Ex09_date(String num, String name, PartType part) {
		super();
		this.num = num;
		this.name = name;
		this.part = part;
	}

	public Ex09_date(String num, String name, PartType part, String enterDate) {
		this.num = num;
		this.name = name;
		this.part = part;
		this.enterDate = enterDate;
	}

	@Override
	public String toString() {
		return "[사번]" + num + "[이름]" + name + "[입사일]" + enterDate;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PartType getPart() {
		return part;
	}

	public void setPart(PartType part) {
		this.part = part;
	}

	public String getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}

}
