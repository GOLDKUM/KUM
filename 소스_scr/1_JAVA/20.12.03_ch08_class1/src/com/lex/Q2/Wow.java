package com.lex.Q2;
//������private ������Account �޼ҵ�void 
//get set ���� 

public class Wow {
	private int width;
	private int height;
	private int depth;//
	private int volume;//
	//���� �κ��� ������
	
	public Wow() {}
	public Wow(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public Wow(int width, int height) {
		this.width=width;
		this.height=height;
	}
	//�����ڸ� ����κ� 
	public void calNsetVolume( ) {
		if(depth==0) { //0�� �����ν� ���簢�� depth ���簢������
			volume = width*height;
		}else { //
			volume=width*height*depth;
		}
	}
	//�޼ҵ带 ���� �κ� 
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth=depth;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int Volume) {
		this.volume=volume;
	}
	
	//���� get set �Һκ�
	//����  ó���� �Է��� ����Ʈ get set�� �������!
	
} //width,height,depth,volume
