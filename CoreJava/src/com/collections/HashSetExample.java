package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		 
	     //add elements to HashSet
	     hset.add("Chaitanya");
	     hset.add("Rahul");
	     hset.add("Tim");
	     hset.add("Rick");
	     hset.add("Harry");
	 
	     
	     int[] n = {1,3,2,4,3,2,4,5,2,4,3};
	     
	     List list1 = Arrays.asList(n);
	     
	     Iterator<String> it = hset.iterator();
	    
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("1");
	    list.add("3");
	    list.add("2");
	    list.add("4");
	    list.add("0");
	    
	    Collections.sort(list);
	    for(String n1:list) {
	    Integer int1 = Integer.parseInt(n1);
	    System.out.println(int1);
	    }

	}

}
