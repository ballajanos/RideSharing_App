package RideSharing;

public class Scooter implements Ride{
	  private int startLocation;
	    private int endLocation;
	    private double charge;

	    public Scooter(int startLocation, int endLocation, double charge) {
	        this.startLocation = startLocation;
	        this.endLocation = endLocation;
	        this.charge = charge;
	    }

	    @Override
	    public int getStartLocation() {
	        return startLocation;
	    }

	    @Override
	    public int getEndLocation() {
	        return endLocation;
	    }

	    public double getCharge() {
	        return charge;
	    }

	    @Override
	    public String acceptRequest() {
	        return "Scooter ride request accepted: " + this.toString();
	    }

	    @Override
	    public String toString() {
	        return "Scooter [Start Location=" + startLocation + ", End Location=" + endLocation + ", Charge=" + charge + " km]";
	    }
}
