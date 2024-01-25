package RideSharing;

import java.util.ArrayList;
import java.util.List;

public class RideMediator {
	 private List<Car> availableCars = new ArrayList<>();
	    private List<Scooter> availableScooters = new ArrayList<>();

	    public void addCar(Car car) {
	        availableCars.add(car);
	    }

	    public void addScooter(Scooter scooter) {
	        availableScooters.add(scooter);
	    }

	    public List<Ride> getAvailableScooters() {
	        List<Ride> rides = new ArrayList<>();
	        rides.addAll(availableScooters);
	        return rides;
	    }
	    
	    public List<Car> getAvailableCars() {
	        return availableCars;
	    }

	    public void requestConfirmation(RideClient client, Ride choice) {
	        String response = choice.acceptRequest();
	        client.receiveConfirmation(response);
	    }
}
