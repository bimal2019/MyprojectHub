package com.datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number []= {5,78,4,6,8,3,89,100,45,32,1,456,2,1222,34,567,900};
		//List list= Arrays.asList(number);
		int max=number[0];
		int min=number[0];
		int first=number[0];
		int second = 0;
		int secondmax=number[0];
		for(int i=0;i <number.length;i++) {
	    	 if(number[i]<min) {
	    		 
	    		 
	    		 min=number[i];
	    	 }
	    	 if(number[i]>max) {
	    		
	    		 max=number[i];
	    	 }
	    	 }
	     System.out.println(min+" "+max);
	     }
	    
	}
	


