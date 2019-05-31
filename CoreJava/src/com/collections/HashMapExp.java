package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


public class HashMapExp implements Comparable<Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer,String> map = new HashMap<Integer,String>();
			
			map.put(1, "Hrisha");
			map.put(2, "Jimmy");
			map.put(12, "Chirag");
			map.put(23, "Vicky");
			map.put(21, "Chirag");
			
			TreeMap<Integer,String> sort = new TreeMap<Integer,String>(map);
			Set<Entry<Integer,String>> set = sort.entrySet();
			
			for(Entry<Integer, String> sets:set) {
				System.out.println(sets.getKey());
			}
			
			
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

