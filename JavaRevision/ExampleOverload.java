package JavaRevision;

public class ExampleOverload {
public void show(String carid) {
	System.out.println("car id number is:"+carid);
}
public void show(int studrollno) {
	System.out.println("Roll number is:"+studrollno);
}
public void show(double salary) {
	System.out.println("Salary is:"+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOverload obj=new ExampleOverload();
obj.show("kl456");
obj.show(47);
obj.show(450000);
	}

}
