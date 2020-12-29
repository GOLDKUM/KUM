package strategy3.component;

public class JobTest {
	private JobImpl jbi;
	private JobParent jp;
	
	public JobTest(JobParent jp, JobImpl jbi){
		this.jbi = jbi;
		this.jp = jp;
	}
}
