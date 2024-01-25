package RideSharing;

public class Car implements Ride{
	  private int startLocation;
	    private int endLocation;

	    public Car(int startLocation, int endLocation) {
	        this.startLocation = startLocation;
	        this.endLocation = endLocation;
	    }

	    @Override
	    public int getStartLocation() {
	        return startLocation;
	    }

	    @Override
	    public int getEndLocation() {
	        return endLocation;
	    }

	    @Override
	    public String acceptRequest() {
	        return "Car ride request accepted: " + this.toString();
	    }

	    @Override
	    public String toString() {
	        return "Car [Start Location=" + startLocation + ", End Location=" + endLocation + "]";
	    }
}
