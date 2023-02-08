package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {

	String customerId;
	ArrayList<Ride> rideList = new ArrayList<Ride>();

	
	public Customer(String customerId, ArrayList<Ride> rideList) {
		this.customerId = customerId;
		this.rideList = rideList;
	}

}
