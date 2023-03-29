package JavaRevision;

public class Add {
int num1,num2;

	public Add(int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
}
	public void sum() {
		int s=num1+num2;
		System.out.println("sum="+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add obj=new Add(3,4);
obj.sum();
}

}
