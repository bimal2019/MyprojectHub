package com.datastructure;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,90,43,45,23,56,78,90,87};
		int index=0;
		int item = 7;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==item) {
				index=i+1;
			}
		}
		if(index ==0) {
			System.out.println("Not Found");
		}
		if(index!=0) {
			System.out.println(index);
		}
	}

}
