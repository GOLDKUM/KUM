package singleton.step1;

public class AClass {
	private int intVar;

	public static AClass INSTANCE;//String �̵��� 
	
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

}// ���蹮�� ���� �̱��� aŬ������ �̱������̽��� �����غ��ÿ�!!
