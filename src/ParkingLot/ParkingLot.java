package ParkingLot;

import ParkingLot.Fee.FairCalculationStrategy;
import ParkingLot.Fee.FlatRateStrategy;
import ParkingLot.ParkingSpot.ParkingSpot;
import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private final List<ParkingFloor> parkingFloors = new ArrayList<>();
    private Map<String, Ticket> activeTickets = new ConcurrentHashMap<>();
    private FairCalculationStrategy fairCalculationStrategy;
    private static final ParkingLot instance = new ParkingLot();

    private ParkingLot() {
        this.fairCalculationStrategy = new FlatRateStrategy();
    }

    public static synchronized ParkingLot getInstance(){
        return instance;
    }

    public void parkVehicle(Vehicle vehicle){

    }

    public void unparkVehicle(Vehicle vehicle){

    }

    public List<ParkingSpot> getAvailableNearestParkingSpots(VehicleType vehicleType){
        return null;
    }


}
