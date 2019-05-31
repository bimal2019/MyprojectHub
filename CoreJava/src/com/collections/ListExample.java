package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * We use List to keep some kind of oreder.
 * 
 * @author bimal3
 *
 */
public class ListExample {

	public static void main(String[] args) {
	
		List<String> strList = new ArrayList<String>();
		strList.add("Brian");
		strList.add("Amy");
		strList.add("Danny");
		strList.add("Jennifer");
		strList.add("Venkat");
		strList.add("Venu");
		strList.add("Shilpa");
		strList.add("Sejal");
		strList.add("Bob");
		strList.add("Frank");
		strList.add("Frank");
		strList.add("Venu");
		
		Collections.sort(strList);
		
		Iterator itr = strList.iterator();
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			set.add((String) itr.next());
		}
		
		for(String strset:set) {
			System.out.println(strset);
		}
	}

}
