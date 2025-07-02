package ParkingLot;

import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    private final String floorId;
    private final int floorNumber;
    private final List<ParkingSpot> parkingSpots;
    public boolean isAvailable;

    public ParkingFloor(String floorId, int floorNumber, List<ParkingSpot> parkingSpots) {
        this.floorId = floorId;
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }

    public void parkVehicle(Vehicle vehicle){

    }

    public void unparkVehicle(Vehicle vehicle){

    }

    public synchronized Optional<ParkingSpot> getAvailableParkingSpots(Vehicle vehicle){
        return null;
    }
}
