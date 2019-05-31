package com.problem;

public class Fibnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i <= 9;i++) {
	System.out.println(fib(i));
}
if(5%1==0) {
	System.out.println("Prime Number");
}

	}
	
	static int fib(int number) {
		if(number==1 || number==2)
			return 1;
		
		
		return fib(number -1) + fib(number-2);
	}

}
