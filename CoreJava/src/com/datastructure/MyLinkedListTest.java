package com.datastructure;

import com.collectionsexample.MyLinkedList;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList(); 
		  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = list.insert(list, 1); 
        list = list.insert(list, 2); 
        list = list.insert(list, 3); 
        list = list.insert(list, 4); 
        list = list.insert(list, 5); 
        list = list.insert(list, 6); 
        list = list.insert(list, 7); 
        list = list.insert(list, 8); 
  
        // Print the LinkedList 
        list.printList(list); 
       System.out.println("SIZE:"+list.size());
       
       if(list.findNode(list, 3)) {
    	   System.out.println("FOUND");
       }
	}

}
