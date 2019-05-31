import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,589,21,32,45,65,43,12,34,567,655,44,56,434,34,6,6,5,
						7,8,9,54,323,45,67,434,23,500,234,123,434,456,67,875,43,4556,78,32,2,43,34,
						64646,343,323,456,789,545,343,445,667,532,345,567,645,434,456,678,545,434,455,434,56,12,2,3,5,67,545,
						3898,323,456,778,767,545,434,23,445,567,656,545,44,34,567,64,43,45,12345,490,23,23,45,45,432,23,4567,
						399,189,67,89,90,98,43,456,677,88,223,345,556,1232,343,444,555,666,777,8888,555,28,21,323,401,378,231,56754,34434,112,
						3234,434,2323,445,6778,656,5434,555,3233,444,5567,12,34,332,221,2345,1234,4534,3,23,65,23,2345,567,123,343,445,789,1245,
						3892,89,902,90,92,45,49,42,44,56,127,565,322,789,9000,323
						};
	int n = arr.length;
	int duplicates=0;
	int temp=0;
	
	Set<Integer> list = new HashSet<Integer>();
	for(int i=0;i < arr.length-1;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]==arr[i]) {
				duplicates = arr[i];
				list.add(duplicates);
				
			}
		}
	}
		for(Integer itr:list) {
			System.out.println(itr);
		}
	}
	}
