package com.stream.examples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(2,4,5,6,78,99,78,12,34,56,532,45,67,789,656,343,12,5,6,78);

	
	int list2=list.stream().filter(x->x > 40)
				.mapToInt(x->x+x).distinct()
				.sorted().sum();
	 System.out.println(list2);
	
	}


}
