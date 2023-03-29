package JavaRevision;

public class Throws {
void method()throws ArithmeticException   {
	int age =19;
	if(age>18)
	{
		throw new ArithmeticException ("Invalid age");
	
	}
}
	public static void main(String[] args) {
		Throws obj=new Throws();
		obj.method();

	}

}
