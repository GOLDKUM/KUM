package com.lex.ex2;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	//������
	public Student() {}
	public Student(String name, int kor, int eng, int mat) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat= mat;
			tot=kor+eng+mat;
			avg=(kor+eng+mat)/3.0;
	}//������
	public void print() {
		System.out.printf("\t %s \t %d \t %d \t %d \t %d \t %.1f\n",
				             name, kor,  eng,   mat,  tot,  avg);
//	public void print() {
//		System.out.println("�̸�="+name+"\t����"+kor+"\t����"+eng+"\t����"
//				+ mat +"����"+tot+"���"+avg/3.0); ���� Ʋ���ɼ���
	}//�޼ҵ�
	
	
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

	
	
	//�Լ� �޼ҵ带 ����� ���� 
	
//���� ġ���ִ� �͵��� �Ӽ� = ������ (class��ü �ȿ��ִ°�)
}
//
//������ = name,kor,eng,mat,tot,avg(double)
//������ new student (���������� 90,90,90) �����ϵ���
//�Լ�=�żҵ�print() 90 	 90 90 270 90.0��µǵ��� ¥����!
