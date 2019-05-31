package com.problem;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("THis is good"));
	}

	private static String reverse(String string) {
		// TODO Auto-generated method stub
		String reverse = "";
		if(string==null || string.isEmpty()) {
			return "";
		}
	for(int i=string.length()-1;i >=0;i--) {
		reverse = reverse + string.charAt(i);
	}
	return reverse;
}
}