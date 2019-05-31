package com.exceptionHandling;

public class HandlingExample extends Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int o = 34/0;
	}catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
System.out.println("ffffff");

Integer int2=23;
int2=34;

System.out.println(int2);

}
}