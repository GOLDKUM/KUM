package singleton.step1;

public class SingletonClass {
	
	private int i;
	public static SingletonClass INSTANCE;//SingletonClass형 객체 주소 
	public static SingletonClass getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new SingletonClass(); //private이니깐 안에서는 가능	
		}
		return INSTANCE; //호출한 곳으로 돌아가서 가격을 바꿔준다. 
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
