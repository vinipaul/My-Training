package com.inheritance;
public class ResultDivisible extends FindAdd {
	public void divisible(int res)
	{
		
	if (res%10==0)
		System.out.println("Yes  "+res+" is divisible by 10");
	else
		System.out.println(res+"  Not divisible by 10");
	}	

	public static void main(String[] args) {
		
ResultDivisible d=new ResultDivisible();
int result=d.add(10,20);
d.divisible(result);
	}


}

	