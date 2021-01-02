package strategy3.modularization;

import strategy3.component.GetImpl;
import strategy3.component.JobImpl;

public class Person {
	private String id;
	private String name;
	private JobImpl job;
	private GetImpl get;
	
	public Person(String id, String name) {
		this.id=id;
		this.name=name;
	}
	public void job() {
		job.job();
	}
	public void get() {
		get.get();
	}
	public void print() {
		System.out.println("[ID]"+id+"\t[이름]"+name);
	}
	@Override
	public String toString() {
		return "[ID]"+id+"\t[이름]"+name;
	}
	public void setJob(JobImpl job) {
		this.job=job;
	}
	public void setGet(GetImpl get) {
		this.get=get;
	}
}
