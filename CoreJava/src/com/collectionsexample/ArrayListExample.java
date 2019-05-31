package com.collectionsexample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collections - 
 * Is a framerwork in java to store and manipulate the object.  Collection framework allowed you to 
 * opertions such as searching,insertion,sorting,deletion,and manipulation
 * 
 * Collection provide several interfaces - Set,List,Dequeue,andqueue, and classes Arraylist,Vector,
 * Vector,LinkedList,LinkedHashset,HashSet,PriorityQueue,andTreeSet
 * 
 * In this example we will be using ArrayList
 * - Can Contains duplicate elements
 * - Maintains insertion order
 * - Non-synchronized
 * - Allows random access because it work on indexed based
 * 	
 * @author bimal3
 *
 */
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> list  = new ArrayList<String>();
      
      list.add("milk");
      list.add("cereal");
      list.add("cheese");
      list.add("butter");
      list.add("juice");
      
      int size = list.size();
      System.out.println(size);
      
     //Iterate thru iterator
      Iterator itr = list.iterator();
      
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
      System.out.println("For-Each\n");
      //Tranversing list for-each
      for(String groceryList:list) {
    	  System.out.println(groceryList);
      }
      //ForeachMethod
     list.forEach(a->{
    	 if(a.contains("milk")) {
    		 System.out.println("MILK");
    	 }
     });
	}
	
}
