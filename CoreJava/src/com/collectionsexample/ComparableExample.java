package com.collectionsexample;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class ComparableExample implements Comparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> companies = new ArrayList<String>();
companies.add("IBM");
companies.add("Microsoft");
companies.add("Cisco");
companies.add("Apple");


	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
