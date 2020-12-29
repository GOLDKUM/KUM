package com.lec.ex05;

public interface IVolume {
	public int TV_MAX_VOLUME = 50;
	public int RADIO_MAX_VOLUME = 30;
	public int MIN_VOLUME = 0;
	public void volumeUp();
	public void volumeUp(int level);
	public void volumeDown();
	public void volumeDown(int level);
	
}


//TV는 volumeUp() volumeDown() +2 -2씩 볼륨 조절.
//Radio volumeup() volumeDown() +1 -1씩 볼룸 조절
//둘다 volumUp(10) volumeDown(10)
//
//TV와 Radio의 최대 볼륨은 상이하다. 최소볼륨0
//위의 인터페이스(작업 명세서)를 이용한 TV(+2,-2), Radio(+1,-1)클래스를 만들어 보고
//메인함수에서 다음을 실행할 수 있도록 구현합니다.

