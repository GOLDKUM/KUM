package strategy1.step3;
public abstract class Robot{

	public void shape() {
		System.out.println(getClass().getName() + 
					"�� ��,�ٸ�,�Ӹ�,�������� �̷���� �ִ�.");
	}
	public void actionWalk() {
		System.out.println("���� �� �ֽ��ϴ�.");
	}

	public void actionRun() {
		System.out.println("�� �� �ֽ��ϴ�.");

	}
	public abstract void actionFly() ;
	public abstract void actionMissile();
	public abstract void actionKnife();
	public void actionMissle() {
		// TODO Auto-generated method stub
		
	}
}
