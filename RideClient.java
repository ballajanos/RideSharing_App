package RideSharing;

import java.util.List;

public class RideClient {
	private RideMediator mediator;
    private int location;

    public RideClient(RideMediator mediator, int location) {
        this.mediator = mediator;
        this.location = location;
    }

    public void requestRide(List<Ride> availableRides, int destinationLocation) {
        System.out.println("Available Rides:");
        for (Ride ride : availableRides) {
            System.out.println(ride);
        }
        chooseBestRide(availableRides, destinationLocation);
    }

    private void chooseBestRide(List<Ride> availableRides, int destinationLocation) {
        if (!availableRides.isEmpty()) {
            Ride bestRide = findBestRide(availableRides, destinationLocation);

            if (bestRide != null) {
                System.out.println("Client chose the best ride: " + bestRide);
                mediator.requestConfirmation(this, bestRide);
            } else {
                System.out.println("No available rides");
            }
        } else {
            System.out.println("No available rides");
        }
    }

    private Ride findBestRide(List<Ride> options, int destinationLocation) {
        if (options.isEmpty()) {
            System.out.println("No available rides.");
            return null;
        }

        Ride bestRide = options.get(0);
        int minDistance = 100;

        for (Ride ride : options) {
            int distance = Math.min(
                    Math.abs(ride.getStartLocation() - location),
                    Math.abs(ride.getEndLocation() - destinationLocation)
            );

            if (distance < minDistance) {
                bestRide = ride;
                minDistance = distance;
            }
        }

        if (bestRide == null) {
            System.out.println("No available rides.");
        }

        return bestRide;
    }

	    public void receiveConfirmation(String response) {
	        System.out.println("Ride confirmed: " + response);
	    }

	    public int getLocation() {
	        return location;
	    }
}