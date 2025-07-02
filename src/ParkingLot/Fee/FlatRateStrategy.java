package ParkingLot.Fee;

import ParkingLot.Ticket;

public class FlatRateStrategy implements FairCalculationStrategy {
    @Override
    public double calculateParkingFee(Ticket ticket) {
        return 0;
    }

}