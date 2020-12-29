package com.lex.Q2;
//데이터private 생성자Account 메소드void 
//get set 순서 

public class Wow {
	private int width;
	private int height;
	private int depth;//
	private int volume;//
	//위에 부분은 데이터
	
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
	//생성자를 만들부분 
	public void calNsetVolume( ) {
		if(depth==0) { //0을 함으로써 직사각형 depth 직사각형높이
			volume = width*height;
		}else { //
			volume=width*height*depth;
		}
	}
	//메소드를 만들 부분 
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
	
	//위에 get set 할부분
	//내가  처음에 입력한 데이트 get set을 해줘야함!
	
} //width,height,depth,volume
