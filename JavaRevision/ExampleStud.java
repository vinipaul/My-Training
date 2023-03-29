package JavaRevision;

public class ExampleStud {
	String studname;
	int empid;	
	
	public ExampleStud() {
		this("vini",47);
	}

	public ExampleStud(String studname, int empid) {
	
		this.studname = studname;
		this.empid = empid;
	}

	public void student() {
		System.out.println("Student name:"+studname);
		System.out.println("Employee id:"+empid);
}
	public void studentdetails() {
		this.student();
	}
	public static void main(String[] args) {
	ExampleStud obj=new ExampleStud();
	obj.studentdetails();

	}

}
