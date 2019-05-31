package com.stream.examples;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class HashMapExp implements Comparable<HashMapExp>{
String name;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public HashMapExp(String name) {
	this.name =name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<HashMapExp,Integer> hm = new HashMap<HashMapExp,Integer>();
hm.put(new HashMapExp("Bimal"), 23);
hm.put(new HashMapExp("Chris"),31);
hm.put(new HashMapExp("Kris"),35);
hm.put(new HashMapExp("Dan"),25);
hm.put(new HashMapExp("Christine"),21);
hm.put(new HashMapExp("Sylvia"),37);
hm.put(new HashMapExp("Bob"),26);

HashMapExp exp = new HashMapExp("bann");


exp.sort(hm);


	}
	 
public void sort(HashMap<HashMapExp,Integer> hm) {
	TreeMap<HashMapExp,Integer> sort = new TreeMap<HashMapExp,Integer>(hm);
	Set<Entry<HashMapExp,Integer>> mapping = sort.entrySet();
	
	for(Entry<HashMapExp,Integer> entry:mapping) {
		System.out.println(entry.getKey().getName());
	}
	
}
	@Override
	public int compareTo(HashMapExp o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}

}
