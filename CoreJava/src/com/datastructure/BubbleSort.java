package com.datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a  = {9,6,7,3,2,5,7,1,4,10,21,13};
		for(int i=0;i <a.length;i++) {
			for(int j=0;j <a.length;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
					
				}
				
			}
		}
for(int i = 0;i < a.length;i++) {
	System.out.println(a[i]);
}
	}

}
