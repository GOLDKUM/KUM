package com.lec.superMarket;

public class CustomerDto {
//cid ctel cname cpoint camount levelname forlevelup
	private String cId;
	private String cTel;
	private String cName;
	private int cPoint;
	private int cAmount;
	private int forLevelup;
	private String levelName;
	
	
	
	public CustomerDto(String cTel, String cName, int cPoint, String levelName) {
		this.cTel = cTel;
		this.cName = cName;
		this.cPoint = cPoint;
		this.levelName = levelName;
	}

	public CustomerDto(String cId, String cTel, String cName, int cPoint,String levelName, int forLevelup ) {
		this.cId = cId;
		this.cTel = cTel;
		this.cName = cName;
		this.cPoint = cPoint;
		this.forLevelup = forLevelup;
		this.levelName = levelName;
	}

	//Ãâ·Â¿ë
	public CustomerDto(String cId, String cTel, String cName, int cPoint, int cAmount,  String levelName,int forLevelup) {
		this.cId = cId;
		this.cTel = cTel;
		this.cName = cName;
		this.cPoint = cPoint;
		this.cAmount = cAmount;
		this.forLevelup = forLevelup;
		this.levelName = levelName;
	}
	@Override
	public String toString() {
		return cId+"\t"+cTel+"\t"+cName+"\t"+cPoint+"\t"+cAmount+"\t"+levelName+"\t"+forLevelup;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcTel() {
		return cTel;
	}

	public void setcTel(String cTel) {
		this.cTel = cTel;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcPoint() {
		return cPoint;
	}

	public void setcPoint(int cPoint) {
		this.cPoint = cPoint;
	}

	public int getcAmount() {
		return cAmount;
	}

	public void setcAmount(int cAmount) {
		this.cAmount = cAmount;
	}

	public int getForLevelup() {
		return forLevelup;
	}

	public void setForLevelup(int forLevelup) {
		this.forLevelup = forLevelup;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	

}
