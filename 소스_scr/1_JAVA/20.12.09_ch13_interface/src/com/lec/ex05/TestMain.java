package com.lec.ex05;

public class TestMain {
	public static void main(String[] args) {
		//IVolume[] device = {new Radio(),new TV()}; 
		Radio radio = new Radio(3);
		TV    tv    = new TV(9);
		IVolume[] device = new IVolume[2];
		device[0] = radio;
		device[1] = tv;
		radio.volumeUp(10);
		tv.volumeUp(10);
		System.out.println("이제부터는 인터페이스를 이용한 호출입니다");
		for(int i=0 ; i<device.length ; i++)
			device[i].volumeUp(10);
		for(IVolume d:device)
			d.volumeUp();
	}
}
