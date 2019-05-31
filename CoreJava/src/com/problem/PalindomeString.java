package com.problem;

public class PalindomeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Bob",b="";
		String a =str;
		int n = a.length();
		for(int i = n-1;i>=0;i-- ) {
			b = b+str.charAt(i);
		}
		//System.out.println("B"+b);
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Palidome String");
		}else {
			System.out.println("NOT PALIDOME");
		}
	}

}
