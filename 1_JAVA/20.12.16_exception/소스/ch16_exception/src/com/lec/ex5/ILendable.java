//2020.12.16 ,yong-kyoung, kum tryCatch¿¹Á¦
package com.lec.ex5;

public interface ILendable {
	public byte STATE_BORROWED = 1;
	public byte STATE_NORMAL = 0;

	public void checkOut(String borrow) throws Exception;

	public void checkIn() throws Exception;

}
