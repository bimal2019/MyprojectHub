package com.streamExample;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Stream is an new features introduced in Java 8. 
 * @author bimal3
 *
 */
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> list  = Arrays.asList("India","America","Iran","Angola","Africa","Britain");
      
      list.stream().filter(word->word.startsWith("A")).forEach(System.out::println);
      list.stream().map(mapper)
	}

}
