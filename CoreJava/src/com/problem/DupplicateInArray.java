package com.problem;

public class DupplicateInArray {

	public static void main(String[] args){
		int[] arr = {2,3,2,4,5,6,7,8,7,8};
		int temp=0;
		int counter =1;
		int[] dup;
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j =1;j<arr.length;j++) {
				
			if(arr[i]==arr[j]&&i!=j) {
				temp = arr[i];
				
				counter++;
			}
			}
		}
	System.out.println(counter);	
	}
		

}
