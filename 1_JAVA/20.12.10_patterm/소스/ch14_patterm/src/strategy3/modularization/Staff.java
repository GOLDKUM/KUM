package strategy3.modularization;

import strategy3.component.GetSalary;
import strategy3.component.JobMng;

public class Staff extends Person {
	private String part;
	public Staff(String id, String name, String part) {
		super(id,name);
		this.part=part;
		setJob(new JobMng());
		setGet(new GetSalary());
	}
	@Override
	public void print() {
		super.print();
		System.out.println("\t[부서]+part");
	}
	@Override
	public String toString() {
		return super.toString()+"\t[부서]"+part;
	}
}
