package com.datastructure;

public class QuickSortImpl {
	 private int array[];
	    private int length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSortImpl sorter = new QuickSortImpl();
	        int[] input = {678,23,45,2,2,3455,67,543,33,567,89,65,43,20,34,123,323,5,28,55,
	        		4905,3,454};
	        sorter.sort(input);
	        for(int i:input){
	            System.out.print(i);
	            System.out.print(" ");
	}
	}

	private void sort(int[] input) {
		// TODO Auto-generated method stub
		if(input.length==0 || input==null) {
			return;
		}
		this.array = input;
		length=input.length;
		 quickSort(0, length - 1);
		}

	private void quickSort(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		 int i = lowerIndex;
	     int j = higherIndex;
	     int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	     
	     while(i <=j) {
	    	 
	    	 if(array[i]<pivot)
	    		 i++;
	    	 if(array[j]>pivot)
	    		 j--;
	    	 if(i<=j) {
	    	 exchangeNumbers(i, j);
             //move index to next position on both sides
             i++;
             j--;
	    	 }
	    	 if (lowerIndex < j)
	             quickSort(lowerIndex, j);
	         if (i < higherIndex)
	             quickSort(i, higherIndex);
         }
     
 }

 private void exchangeNumbers(int i, int j) {
     int temp = array[i];
     array[i] = array[j];
     array[j] = temp;
 }
	
	}

