package com.datastructure;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {4,2,5,7,99,87,34,223,67,89,88,65,43,21,90};
		 int item, location = -1;  
		  System.out.println("Enter the item which you want to search");  
		  Scanner sc = new Scanner(System.in);
		  item = sc.nextInt();  
		  location = binarySearch(a,0,13,item);  
		  if(location != -1)  
		  System.out.println("the location of the item is "+location);  
		  else   
		    System.out.println("Item not found");  
		  }

	private static int binarySearch(int[] a, int beg, int end, int item) {
		// TODO Auto-generated method stub
		 int mid; 
		 
		  if(end >= beg)   
		  {   
		    mid = (beg + end)/2;  
		    if(item==a[mid])  
		    {  
		      return mid+1;  
		    }  
		    else if(a[mid] < item)   
		    {  
		      return binarySearch(a,mid+1,end,item);  
		    }  
		    else   
		    {  
		      return binarySearch(a,beg,mid-1,item);  
		    }  
		  }  
		  return -1;   
		}  
	}  

	


