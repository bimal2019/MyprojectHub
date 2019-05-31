package com.problem;

public class BubbleSort {

	public static void main(String[] args) {
		int temp=0;
		int[] n = {45,21,56,32,7,1,90};
		int length = n.length;
		
		for(int i=0;i<length;i++) {
			for(int k=0;k < length-1;k++) {
				if(n[i]<n[k]) {
					temp = n[i];
					n[i]=n[k];
					n[k]=temp;
				}
			}
				}
		for(int j=0;j<length;j++) {
			System.out.println(n[j]);
		}
			}

				
	
	}


