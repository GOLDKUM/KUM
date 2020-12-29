package singleton.step2;

public class FirstClass {
	public FirstClass() {
		SingletonClass singletonobject = SingletonClass.getInstance();
		System.out.println("FistClass형 객체 생성");
		System.out.println(singletonobject.getI());
		
		singletonobject.setI(999);
		System.out.println("변경 후 i 값 (FirstClass에서"+
						singletonobject.getI());
		System.out.println("FirstClass형 생성자 끝");
	}


}
