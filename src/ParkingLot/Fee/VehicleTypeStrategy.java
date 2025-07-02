package ParkingLot.Fee;

import ParkingLot.Ticket;

public class VehicleTypeStrategy implements FairCalculationStrategy {
    @Override
    public double calculateParkingFee(Ticket ticket) {
        return 0;
    }
}
