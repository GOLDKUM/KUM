package singleton.step2;

public class SecondClass {
	public SecondClass() {
		SingletonClass singletonObject = SingletonClass.getInstance();
		System.out.println("SecondClass 持失切");
		System.out.println(singletonObject.getI());
		System.out.println("SecondClass 持失切 魁===");
	}

}
