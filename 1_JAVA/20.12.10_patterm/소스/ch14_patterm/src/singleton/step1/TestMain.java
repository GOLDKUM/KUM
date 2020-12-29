package singleton.step1;

public class TestMain {
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println("초기화된 i값: "+obj1.getI());
		obj1.setI(999);
		System.out.println("obj1의 i값을 변경한 후 obj2의 값:"
		                                 +obj2.getI());
		System.out.println("=======================");
		AClass aObj = AClass.getInstance();
		aObj.setInVar(999);
		AClass bObj = AClass.getInstance();
		System.out.println(bObj.getIntVar());
		
	
	}
	
}
