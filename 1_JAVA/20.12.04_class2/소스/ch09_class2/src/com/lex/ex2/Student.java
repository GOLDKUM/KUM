package com.lex.ex2;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	//데이터
	public Student() {}
	public Student(String name, int kor, int eng, int mat) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat= mat;
			tot=kor+eng+mat;
			avg=(kor+eng+mat)/3.0;
	}//생성자
	public void print() {
		System.out.printf("\t %s \t %d \t %d \t %d \t %d \t %.1f\n",
				             name, kor,  eng,   mat,  tot,  avg);
//	public void print() {
//		System.out.println("이름="+name+"\t국어"+kor+"\t영어"+eng+"\t수학"
//				+ mat +"총점"+tot+"평균"+avg/3.0); 내가 틀린걸수도
	}//메소드
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getMat() {
		return mat;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getTot() {
		return tot;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getAvg() {
		return avg;
	}

	
	
	//함수 메소드를 만들어 보자 
	
//내가 치고있는 것들은 속성 = 데이터 (class개체 안에있는것)
}
//
//데이터 = name,kor,eng,mat,tot,avg(double)
//생성자 new student (“정수성” 90,90,90) 가능하도록
//함수=매소드print() 90 	 90 90 270 90.0출력되도록 짜보자!
