package com.problem;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6));
	}

	private static int fact(int number) {
		// TODO Auto-generated method stub
		if(number ==0)
			return 1;
		return number * fact(number-1);
	}

}
