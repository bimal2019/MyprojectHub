package com.collectionsexample;

import java.util.List;

public class MyLinkedList {
	
	Node head;
	static int size;
	static class Node{
		private int data;
		private Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	public static MyLinkedList insert(MyLinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head==null) {
			list.head = new_node;
		}else {
			Node last = list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		size++;
		return list;
	
			}
	
	 public static void printList(MyLinkedList list) 
	    { 
	        Node currNode = list.head; 
	   
	        System.out.print("LinkedList: "); 
	   
	        // Traverse through the LinkedList 
	        while (currNode != null) { 
	            // Print the data at current node 
	            System.out.print(currNode.data + " "); 
	   
	            // Go to next node 
	            currNode = currNode.next; 
	        } 
	  
	    }
	 public boolean findNode(MyLinkedList list,int key) {
		 
		 
		 Node currNode = list.head;
		 
		 
		 while (currNode != null) { 
	            // Print the data at current node 
	           // System.out.print(currNode.data + " "); 
	   
	            // Go to next node 
	            currNode = currNode.next; 
	            if(currNode.data==key) {
	            	return true;
	            
	            }
	         
	          
	          
	        
	            }
		 
		 return false;
	 }
	 
	 
	 public int size() {
		 return size;
	 }
}
	
