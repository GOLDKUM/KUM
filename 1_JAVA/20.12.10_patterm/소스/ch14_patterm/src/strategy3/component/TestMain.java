package strategy3.component;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobChild jc = new JobChild(); // JobParent ���
		JobChild2 jc2 = new JobChild2(); // JobImpl ����
		
		JobTest jt = new JobTest(jc, jc2);
	}

}
