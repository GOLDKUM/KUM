package com.lec.ex06toy;

public class MazingerToy implements IMissile, IMoveArmLeg {
	public MazingerToy() {
		System.out.println("��¡�� �峭���Դϴ�");
		canMissle();
		canMoveArmLeg();
		System.out.println("=====================");
	}

	@Override
	public void canMoveArmLeg() {
		System.out.println("�ȴٸ��� ������ �� �ֽ��ϴ�.");

	}

	@Override
	public void canMissle() {
		System.out.println("�̻����� �� �� �ֽ��ϴ�.");

	}
	@Override
	public String toString() {
		
		return "�̻��Ͻ�� �ȴٸ� �����̴� �峭��";
	}

}
