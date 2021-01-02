package singleton.step1;

public class SingletonClass {
	
	private int i;
	public static SingletonClass INSTANCE;//SingletonClass�� ��ü �ּ� 
	public static SingletonClass getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new SingletonClass(); //private�̴ϱ� �ȿ����� ����	
		}
		return INSTANCE; //ȣ���� ������ ���ư��� ������ �ٲ��ش�. 
	}
	private SingletonClass() {
		i=10;
	}

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
