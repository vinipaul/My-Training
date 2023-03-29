package JavaRevision;

public class Child extends Father {
public void see() {
	System.out.println("This is child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.print();
		obj.show();
		obj.see();

	}

}
