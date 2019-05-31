package com.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"bob","Jeff","dan","april","chris","james","peter"};
		List<String> name = Arrays.asList(str);
		
		List<String>listWithj =name.stream().filter(names->names.startsWith("j")).collect(Collectors.toList());
		System.out.println(listWithj);
		}

	}


