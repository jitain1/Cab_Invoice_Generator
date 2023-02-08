package com.bridgelabz;

public class Ride {
	
	
	double distance;
	double time;
	
	private RideCategory rideCategory;

	public RideCategory getRideCategory() {
		return rideCategory;
	}



	public enum RideCategory {
		NORMAL_RIDE(10, 1, 5), PREMIUM_RIDE(15, 2, 20);

		public double costPerKm;
		public int costPerMinute;
		public double minimumFarePerRide;

		RideCategory(double costPerKm, int costPerMinute, double minimumFarePerRide) {
			this.costPerKm = costPerKm;
			this.costPerMinute = costPerMinute;
			this.minimumFarePerRide = minimumFarePerRide;
		}
	}
	
	
	
	public Ride(double distance, double time, RideCategory rideCategory) {
		this.distance = distance;
		this.time = time;
		this.rideCategory = rideCategory;
	}



	/**
	 * @param distance : Total distance travelled with cab.
	 * @param time : Total time taken to complete a trip.
	 */
	public Ride(double distance, double time) {
		this.distance = distance;
		this.time = time;
	}
	
	
}
