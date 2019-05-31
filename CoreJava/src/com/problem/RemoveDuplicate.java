package com.problem;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,4,1,1,2,4};
		int temp;
		int[] noDup; 
		for(int i=0;i < arr.length;i++) {
			 temp = arr[i];
		     for(int j = 1;j < arr.length-1;j++) {
		    	 if(temp!=arr[j]) {
		    		 noDup[i]=temp;
		    	 }
		    	 
		    	 
		     }
		}
	}

}
