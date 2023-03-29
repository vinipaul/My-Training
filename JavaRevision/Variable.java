package JavaRevision;

public class Variable {
int carid=56;
static String studname="vini";
static int studid=47;
static int empid=10;
	public static void main(String[] args) {
		 
		//Variable varobj=new Variable();
		//varobj.student();
		String sname=statmethod(studname,studid);
		System.out.println(sname);
		
	}
public void student()
{
	int studmark=98;
	System.out.println(studmark);
	System.out.println("This is instance method");
}
public static String statmethod(String studname,int studid) {
	System.out.println("This is static method");
	System.out.println("Student name:"+studname+"  StudentId:"+studid);
	return studname;
}

}
