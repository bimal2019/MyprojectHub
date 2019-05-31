package com.collections;

public class OverRideHashCodeEqual {
private String name;
private int id;

OverRideHashCodeEqual(String nm,int i){
	this.name = nm;
	this.id = i;
}

@Override
public boolean equals(Object obj) {
	
	//If both object pointing to same reference
	if(this==obj)
		return true;
	
	if(obj==null || obj.getClass()!=this.getClass())
		return false;
	
	OverRideHashCodeEqual overEq = (OverRideHashCodeEqual)obj;
	
	return overEq.name.equals(this.name) && overEq.id==this.id;
	
	
}
@Override
public int hashCode() {
	return this.id;
}



}

