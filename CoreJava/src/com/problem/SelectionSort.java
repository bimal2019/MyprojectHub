package com.problem;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {89,23,67,12,23,45,21,34,32,7,9,6};
		int index;
		
		
/**
 *  for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        
        */
		for (int i=0;i<n.length;i++) {
			index=i;
			for(int j=i+1;j<n.length;j++) {
				if(n[j]<n[i]) {
					index=j;
				int small=n[index];
				n[index]=n[i];
				n[i]=small;
			}
				}
		}
			
				
		for(int b=0;b <n.length;b++) {
			System.out.println(n[b]);
		}
				
				
				
				
				
				
				
				

		
	}

}
