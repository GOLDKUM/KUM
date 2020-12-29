package singleton.step2;

public class SingletonClass {
	private static SingletonClass INSTANCE;
//	private static SingletonClass INSTANCE= new SingletonClass; �̷��� ���� if�� ���ʿ����!! 
	
	private           int             i;
	
	private SingletonClass() {
		i=10;
	}
	public static SingletonClass getInstance() {
//		                                           ����޼ҵ��̸� �ƹ����Գ�
		if(INSTANCE==null) {
			INSTANCE = new SingletonClass();
		}
		return INSTANCE;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	

}
