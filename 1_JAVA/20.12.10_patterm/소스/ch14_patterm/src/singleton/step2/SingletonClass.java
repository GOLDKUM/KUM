package singleton.step2;

public class SingletonClass {
	private static SingletonClass INSTANCE;
//	private static SingletonClass INSTANCE= new SingletonClass; 이렇게 쓰면 if를 쓸필요없음!! 
	
	private           int             i;
	
	private SingletonClass() {
		i=10;
	}
	public static SingletonClass getInstance() {
//		                                           여기메소드이름 아무렇게나
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
