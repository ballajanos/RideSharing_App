package RideSharing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RideMediator rideMediator = new RideMediator();
        int clientLocation = 5;
        int destinationLocation = 30;

        RideClient client = new RideClient(rideMediator, clientLocation);

        System.out.println("Client's initial location: " + client.getLocation());
        System.out.println("Client's destination location: " + destinationLocation);

        rideMediator.addCar(new Car(1, 20));
        rideMediator.addCar(new Car(5, 15));
        rideMediator.addCar(new Car(6, 20));
        rideMediator.addCar(new Car(8, 25));
        rideMediator.addScooter(new Scooter(15, 50, 30));
        rideMediator.addScooter(new Scooter(10, 30, 15));

        List<Ride> availableRides = new ArrayList<>();
        availableRides.addAll(rideMediator.getAvailableScooters());
        availableRides.addAll(rideMediator.getAvailableCars());

        client.requestRide(availableRides, destinationLocation);

    }
}
