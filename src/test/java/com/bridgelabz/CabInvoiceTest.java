package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.Ride.RideCategory;

public class CabInvoiceTest {
	CabInvoice cabInvoice = new CabInvoice();

	/* Checking total fare */
//	@Test
//	void givenDistanceAndTimeShouldReturnTotalFare() {
//		double actualFare = cabInvoice.calculateFare(2.0, 5.0);
//		Assertions.assertEquals(25, actualFare);
//	}
//
//	/* Checking minimum fare */
//	@Test
//	void givenDistanceAndTimeShouldReturnMinimumFare() {
//		double actualFare = cabInvoice.calculateFare(0.1, 0.5);
//		Assertions.assertEquals(5, actualFare);
//	}
//
//	/* Checking Total fare of multiple rides */
//	@Test
//	void givenNumberOfRidesShouldReturnTotalFare() {
//		List<Ride> rideList = new ArrayList<Ride>();
//		rideList.add(new Ride(2.0, 5.0));
//		rideList.add(new Ride(3.0, 7.0));
//		rideList.add(new Ride(0.1, 0.3));
//
//		double totalFare = cabInvoice.calculateFare(rideList);
//		Assertions.assertEquals(67, totalFare);
//	}
//
//	/* Checking the Generated Invoice */
//	@Test
//	void givenMultipleRidesShouldReturnInvoice() {
//		List<Ride> rideList = new ArrayList<Ride>();
//		rideList.add(new Ride(2.0, 5.0));
//		rideList.add(new Ride(3.0, 7.0));
//		rideList.add(new Ride(0.1, 0.3));
//
//		InvoiceSummary actualInvoice = cabInvoice.generateInvoice(rideList);
//		InvoiceSummary expectedInvoice = new InvoiceSummary(3, 67.0, 67.0 / 3);
//		Assertions.assertEquals(expectedInvoice, actualInvoice);
//	}
	
//	@Test
//	void givenUserIdShouldReturnInvoice() {
//		ArrayList<Ride> rideList = new ArrayList<Ride>();
//		rideList.add(new Ride(2.0, 5.0));
//		rideList.add(new Ride(3.0, 7.0));
//		rideList.add(new Ride(0.1, 0.3));
//		
//		CustomerDetails customer1 = new CustomerDetails("1" , rideList);
//		
//		InvoiceSummary actualInvoice = cabInvoice.generateInvoiceById(customer1.customerId);
//		InvoiceSummary expectedInvoice = new InvoiceSummary(3, 67.0, 67.0 / 3);
//		Assertions.assertEquals(expectedInvoice, actualInvoice);
//	}
	
	@Test
	void givenPremiumRideShouldCalculateWithPremiumFareNReturnInvoice() {
		ArrayList<Ride> rideList = new ArrayList<Ride>();
		rideList.add(new Ride(2.0, 5.0, Ride.RideCategory.PREMIUM_RIDE));
		rideList.add(new Ride(3.0, 7.0, Ride.RideCategory.PREMIUM_RIDE));
		rideList.add(new Ride(0.1, 0.3, Ride.RideCategory.PREMIUM_RIDE));
		Customer customer1 = new Customer("1" , rideList);
		RideHistory.customerList.add(customer1);
		
		InvoiceSummary actualInvoice = cabInvoice.generateInvoiceById(customer1.customerId);
		InvoiceSummary expectedInvoice = new InvoiceSummary(3, 119.0, 119.0/3);
		Assertions.assertEquals(expectedInvoice, actualInvoice);
	}
	

}
