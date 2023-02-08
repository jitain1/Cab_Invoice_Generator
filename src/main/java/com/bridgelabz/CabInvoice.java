package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.Ride.RideCategory;

public class CabInvoice {

	public double calculateFare(Ride ride) {
		double fare = ride.distance * ride.getRideCategory().costPerKm
				+ ride.time * ride.getRideCategory().costPerMinute;
		
		if (fare < ride.getRideCategory().minimumFarePerRide)
			return ride.getRideCategory().minimumFarePerRide;
		
		return fare;
	}

	public double calculateFare(List<Ride> rideList) {
		double totalFare = 0;
		
		for (Ride ride : rideList) {
			totalFare += calculateFare(ride);
		}

		return totalFare;
	}

	public InvoiceSummary generateInvoice(List<Ride> rideList) {
		double totalFare = calculateFare(rideList);
		System.out.println(totalFare);
		int totalRides = rideList.size();
		double avgFare = totalFare / totalRides;

		return new InvoiceSummary(totalRides, totalFare, avgFare);
	}

//	public InvoiceSummary generateInvoiceById(String id) {
//		double totalFare = calculateFare(CustomerDetails.allCustomers.get(id));
//		int totalRides = CustomerDetails.allCustomers.get(id).size();
//		double avgFare = totalFare / totalRides;
//		
//		return new InvoiceSummary(totalRides,totalFare,avgFare);
//		
//	}
//
	public InvoiceSummary generateInvoiceById(String customerId) {
		ArrayList<Ride> rideList = RideHistory.generateInvoiceByUserId(customerId);
		return generateInvoice(rideList);
	}

}
