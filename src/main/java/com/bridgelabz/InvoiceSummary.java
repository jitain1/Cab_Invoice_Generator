package com.bridgelabz;

public class InvoiceSummary {
    int totalRides;
    double totalFare;
    double avgFare;

    

	/**
	 * @param totalRides : Total number of rides/trip
	 * @param totalFare : Total cost after all the rides
	 * @param avgFare : Totalcost/Totalrides
	 */
	public InvoiceSummary(int totalRides, double totalFare, double avgFare) {
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.avgFare = avgFare;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return Double.doubleToLongBits(avgFare) == Double.doubleToLongBits(other.avgFare)
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare)
				&& totalRides == other.totalRides;
	}
	
}
