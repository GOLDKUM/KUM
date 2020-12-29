package strategy3.modularization;

public class TestMain {
	public static void main(String[] args) {
		Student st1 = new Student("30301","���л�","phthon��");
		Student st2 = new Student("30302","������","Java��");
		Lecturer gs1= new Lecturer("Jo1","ȫ����","hadoop��");
		Lecturer gs2= new Lecturer("J02","�����","db");
		Staff s = new Staff("Ao1","������","�������");
	
		Person[] person = {st1, st2 ,gs1 ,gs2 ,s};
		System.out.println("==================================");
		System.out.println("==�����ð��̴� �� ���սô�");
		for(Person p : person)
			p.job();//���̰� job�ϱ��!! ���� ���ذ� �Ȱ��� 
			
		System.out.println("==������ �� ������ �� ����");
        for(Person p: person)
        	p.get();
        System.out.println("==�ñ��ϸ� ����Ʈ");
        for(Person p : person)
        	p.print();
 	}

}
