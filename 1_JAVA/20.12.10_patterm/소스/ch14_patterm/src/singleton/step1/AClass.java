package singleton.step1;

public class AClass {
	private int intVar;

	public static AClass INSTANCE;//String 이든지 
	
	public static AClass getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new AClass();
		}
		return INSTANCE;
	}
		
		
	public AClass() {
	}

	public int getIntVar() {
		return intVar;

	}

	public void setInVar(int intVar) {
		this.intVar = intVar;
	}

}// 시험문제 문제 싱글펀 a클래스로 싱글턴페이스로 수정해보시오!!
