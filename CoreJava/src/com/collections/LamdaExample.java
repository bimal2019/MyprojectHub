package com.collections;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;
interface A{
	String dr = new String("DDD");
}
public class LamdaExample {
	static int balance ;
	
	void call () {
		int balance =5;
		System.out.println(balance);
	}

	public static void main(String[] args) {
		String str ="bimal";
		String str1 = new String("bimal");
		if(str.matches(str1)) {
			System.out.println("DDD");
		}
		LamdaExample exp = new LamdaExample();
	   exp.call();
		// TODO Auto-generated method stub
	//List<? extends Number> ddd=
	/*	List<String> name = new ArrayList<String>();
		name.add("Hrisha");
		name.add("Bimal");
		name.add("Sejal");
		name.add("Riaan");
		name.add("Aarav");
		name.add("Rishi");
		name.add("Rohan");
		name.add("Arjun");
		name.add("Urvi");
		name.add("Ba");
		name.add("Bimal");
		name.add("Urvi");*/
		
//	long acount = 345_234_23;
	//float test = 123_.34;


		//name.forEach((String name1)->System.out.println(name1));
		//name.forEach(StringUtils::capitalize);
		
		//name.stream().map(name1->name1.toUpperCase())
			//.forEach(name1->System.out.println(name1));// the map() method collects the result of running the lambda expression and 
													//returns the result collection useful  
													//This method will ensure that the same number of elements exists 
													//in the input and the output sequence
	
		//name.stream()
			//		.map(name1->name1.length())
				//	.forEach(count->System.out.println(count));
	//	System.out.println("TOTAL CHARACTERS:"+ name.stream()
	//											.mapToInt(name1->name1.length())
							//					.min());
		//			

		
		//List<String> list=name.stream().sorted
				
					
					
		
		
		
		
	}
	
	
}
