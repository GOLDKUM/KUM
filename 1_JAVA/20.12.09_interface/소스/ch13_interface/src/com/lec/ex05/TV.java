package com.lec.ex05;

public class TV implements IVolume {
	private int volumeLevel;
	public TV() {
		volumeLevel = 10;
	}
	public TV(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	@Override
	public void volumeUp() {
		// 48 - > 50만큼 
		volumeLevel += 2;
		if(volumeLevel >= TV_MAX_VOLUME) {
			volumeLevel = TV_MAX_VOLUME;
			System.out.println("볼륨이 최대치입니다. 청력에 위험합니다");
		}else {
			System.out.println("TV 볼륨을 "+2+"만큼 올려 "+volumeLevel);
		}
	}
	@Override
	public void volumeUp(int level) {
		// 40 - > 50만큼 
		volumeLevel += level;
		if(volumeLevel >= TV_MAX_VOLUME) {
			volumeLevel = TV_MAX_VOLUME;
			System.out.println("볼륨이 최대치입니다. 청력에 위험합니다");
		}else {
			System.out.println("TV 볼륨을 "+level+"만큼 올려 "+volumeLevel);
		}
	}
	@Override
	public void volumeDown() {
		volumeLevel -= 2;
		if(volumeLevel <= MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("현재 무음입니다");
		}
		System.out.println("TV 볼륨을 "+2+"만큼 내려 "+volumeLevel);
	}
	@Override
	public void volumeDown(int level) {
		volumeLevel -= level;
		if(volumeLevel <= MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("현재 무음입니다");
		}
		System.out.println("TV 볼륨을 "+level+"만큼 내려 "+volumeLevel);
	}

}
