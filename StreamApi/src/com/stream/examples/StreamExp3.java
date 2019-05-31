package com.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<Person> people = Arrays.asList(new Person("John", 20), new Person("Sara", 21),
				new Person("Jane", 39), new Person("Greg", 35));
		
		//List<Person> list=people.stream()
			//				.sorted((person1, person2) -> person1.ageDifference(person2))
				//			.collect(Collectors.toList());
		
		List<Person> list=people.stream()
				.sorted((person1, person2) -> person1.ageDifference(person2))
				.collect(Collectors.toList());
		
		System.out.println(list);

	}

}
