package com.stream.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamExp2 implements Comparable<StreamExp2>{
	  private String item;
	    private int price;
	     
	    public StreamExp2(String itm, int pr){
	        this.item = itm;
	        this.price = pr;
	    }
	     
	    public int hashCode(){
	        System.out.println("In hashcode");
	        int hashcode = 0;
	        hashcode = price*20;
	        hashcode += item.hashCode();
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof StreamExp2) {
	        	StreamExp2 pp = (StreamExp2) obj;
	            return (pp.item.equals(this.item) && pp.price == this.price);
	        } else {
	            return false;
	        }
	    }
	     
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	        this.price = price;
	    }
	     
	    public String toString(){
	        return "item: "+item+"  price: "+price;
	    }
public void sorted(HashMap<StreamExp2,String> hm) {
	TreeMap<StreamExp2,String> sort = new TreeMap<StreamExp2,String>(hm);
	Set<Entry<StreamExp2, String>> mappings = sort.entrySet();
	
	for(Entry<StreamExp2, String> entry : mappings){ System.out.println("KEY"+entry.getKey() );}
	}
	
	 public static void printMap(HashMap<StreamExp2, String> map){
       
	        Set< StreamExp2> keys = map.keySet();
	        for( StreamExp2 p:keys){
	            System.out.println(p+"==>"+map.get(p));
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person per = new Person(23,"Bimal");
		 HashMap<StreamExp2, String> hm = new HashMap<StreamExp2, String>();
	        hm.put(new StreamExp2("Banana",45), "Banana");
	        hm.put(new StreamExp2("Orange", 40), "Orange");
	        hm.put(new StreamExp2("Apple", 30), "Apple");
	        printMap(hm);
	        StreamExp2 key = new StreamExp2("Banana", 45);
	        System.out.println("Does key available? "+hm.containsKey(key));
		   	        
 
	        key.sorted(hm);
	}

	@Override
	public int compareTo(StreamExp2 o) {
		// TODO Auto-generated method stub
		return this.item.compareTo(o.getItem());
		}
	

	
}