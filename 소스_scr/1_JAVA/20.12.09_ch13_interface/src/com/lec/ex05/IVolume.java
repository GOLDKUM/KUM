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


//TV�� volumeUp() volumeDown() +2 -2�� ���� ����.
//Radio volumeup() volumeDown() +1 -1�� ���� ����
//�Ѵ� volumUp(10) volumeDown(10)
//
//TV�� Radio�� �ִ� ������ �����ϴ�. �ּҺ���0
//���� �������̽�(�۾� ����)�� �̿��� TV(+2,-2), Radio(+1,-1)Ŭ������ ����� ����
//�����Լ����� ������ ������ �� �ֵ��� �����մϴ�.

