package singleton.step2;

public class TestMain {
	public static void main(String[] args) {
		FirstClass firstObj = new FirstClass();
		SecondClass secondObj1 = new SecondClass();
		SingletonClass singObj = SingletonClass.getInstance();
		System.out.println("���θ޼ҵ忡�� singObj���� i����");
		System.out.println(singObj.getI());
	}

}
