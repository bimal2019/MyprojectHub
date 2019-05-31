package com.collections;
import com.collections.OverRideHashCodeEqual;
public class OverRideHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRideHashCodeEqual overEqHa = new OverRideHashCodeEqual("Bimal",34);
		OverRideHashCodeEqual overEqHa1 = new OverRideHashCodeEqual("Bimal",34);
		System.out.println(overEqHa.hashCode());
		
		if(overEqHa.equals(overEqHa1)) {
			System.out.println("NOT SAME");
		}
	}

}
