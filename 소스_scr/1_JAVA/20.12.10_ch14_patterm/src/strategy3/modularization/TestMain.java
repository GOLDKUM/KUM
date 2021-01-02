package strategy3.modularization;

public class TestMain {
	public static void main(String[] args) {
		Student st1 = new Student("30301","강학생","phthon반");
		Student st2 = new Student("30302","강공부","Java반");
		Lecturer gs1= new Lecturer("Jo1","홍강의","hadoop반");
		Lecturer gs2= new Lecturer("J02","김수업","db");
		Staff s = new Staff("Ao1","신일해","취업지원");
	
		Person[] person = {st1, st2 ,gs1 ,gs2 ,s};
		System.out.println("==================================");
		System.out.println("==업무시간이니 다 일합시다");
		for(Person p : person)
			p.job();//왜이게 job일까요!! 정말 이해가 안가네 
			
		System.out.println("==월말엔 다 지급할 것 지금");
        for(Person p: person)
        	p.get();
        System.out.println("==궁금하면 프린트");
        for(Person p : person)
        	p.print();
 	}

}
