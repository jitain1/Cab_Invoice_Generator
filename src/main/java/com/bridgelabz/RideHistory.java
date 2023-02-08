package com.bridgelabz;

import java.util.ArrayList;

public class RideHistory {

	static ArrayList<Customer> customerList = new ArrayList<>();

	public static ArrayList<Ride> generateInvoiceByUserId(String userId) {
		for (Customer customer : customerList) {
			if (customer.customerId.equals(userId)) {
				return customer.rideList;
			}
		}
		return null;
	}
}
