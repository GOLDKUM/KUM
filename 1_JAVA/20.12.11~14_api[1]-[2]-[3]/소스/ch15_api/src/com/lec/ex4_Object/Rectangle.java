//2020-12-15 ⒦금경용
package com.lec.ex4_Object;

public class Rectangle {
	private int width;// 가로
	private int length;// 세로

	private String color;

	public Rectangle(String color) {
		this.color = color;
	}

	public Rectangle(int width, int length, String color) {
		this.width = width;
		this.length = length;
		this.color = color;
	}

	@Override
	public String toString() {
		return "[가로]" + width + "[세로]" + length + "[컬러]" + color;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj instanceof Rectangle) {
			boolean ww = width == ((Rectangle) obj).width;
			boolean ll = length == ((Rectangle) obj).length;
			boolean cc = color == ((Rectangle) obj).color;
			return ww && ll && cc;

		}

		return false;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getEngth() {
		return length;
	}

	public void setEngth(int ength) {
		this.length = ength;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
