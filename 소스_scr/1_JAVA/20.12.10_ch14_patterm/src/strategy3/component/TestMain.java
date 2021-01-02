package strategy3.component;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobChild jc = new JobChild(); // JobParent 상속
		JobChild2 jc2 = new JobChild2(); // JobImpl 인플
		
		JobTest jt = new JobTest(jc, jc2);
	}

}
