package strategy3.modularization;

import strategy3.component.GetImpl;
import strategy3.component.GetStudentPay;
import strategy3.component.JobImpl;
import strategy3.component.JobStudy;

public class Student extends Person{
	private String ban;
	public Student(String id, String name, String ban) {
		super(id,name);
		this.ban=ban;
		 setJob(new JobStudy());
		 setGet(new GetStudentPay());
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("\t[¹Ý]"+ban);
	}
	@Override
	public String toString() {
		return super.toString()+"\t[¹Ý]"+ban;
	}

}
