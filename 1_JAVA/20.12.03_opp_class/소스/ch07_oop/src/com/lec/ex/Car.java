package com.lec.ex;
//Car myPorsche = new car();
//myPorsche.color="red";
//Scanner sc = new Scanner(~);
public class Car {
	private String color;//������(private), �޼ҵ�(public)
	private int cc;
	private int speed;
	public Car() {//������ = ����Ÿ���� ���� Ŭ������� ���� �̸��� �޼ҵ�
		//����Ʈ �������Լ��� �������Լ��� ������ jVM�� �ڵ�����
		//��ü ������ ������ �� �ڵ�ȣ��(����)
		cc = 1000; 
	}
	public void drive() {      //�޼ҵ�(public)��
		speed = 60;
		System.out.println("�����Ѵ� ���ݼӵ�: "+speed);
	}
	public void park() {
		speed=0;
		System.out.println("�����Ѵ� ���� �ӵ�: "+speed);
	}
	public void race() {
		System.out.println("���̽��Ѵ�. ���ݼӵ� :"+speed);
	}
	//~.setColor("red")
	public void setColor(String color) {
		this.color = color;
	}
	//~.getColor()
	public String getColor() {
		return color;
	}
	//~.getCc()
	public int getCc() {
		return cc;
	}
}	


