package singleton.step2;

public class FirstClass {
	public FirstClass() {
		SingletonClass singletonobject = SingletonClass.getInstance();
		System.out.println("FistClass�� ��ü ����");
		System.out.println(singletonobject.getI());
		
		singletonobject.setI(999);
		System.out.println("���� �� i �� (FirstClass����"+
						singletonobject.getI());
		System.out.println("FirstClass�� ������ ��");
	}


}
