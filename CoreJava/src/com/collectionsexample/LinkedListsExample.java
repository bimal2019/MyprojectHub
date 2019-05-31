package com.collectionsexample;

import java.util.LinkedList;

/**
 * LinkedList can contains duplicates elements
 * Maintains insertion order
 * non-synchronized
 * manipulation is fast because no shifting is required
 * can be used as a list,stack,queue
 * @author bimal3
 *
 */
public class LinkedListsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> country = new LinkedList<String>();
		country.add("India");
		country.add("Germany");
		country.add("USA");
		country.add("China");
		country.add("Canada");
		
		country.forEach(a->System.out.println(a));
		System.out.println("----------------------------");
		country.removeFirst();
		
		country.forEach(a->System.out.println(a));		
		
		
	}

}
