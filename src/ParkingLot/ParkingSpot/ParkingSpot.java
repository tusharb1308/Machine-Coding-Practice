package ParkingLot.ParkingSpot;

import ParkingLot.Vehicle.Vehicle;

public abstract class ParkingSpot {
    private final String spotId;
    private Vehicle vehicle;
    private boolean isAvailable;

    protected ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isAvailable = false;
    }

    public synchronized boolean isAvailable(){
        return !isAvailable;
    }

    public synchronized void assignVehicle(Vehicle vehicle){

    }

    public void removeVehicle(){

    }

    public abstract boolean canFitVehicle(Vehicle vehicle);

}