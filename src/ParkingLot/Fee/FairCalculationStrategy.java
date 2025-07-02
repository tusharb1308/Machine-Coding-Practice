package ParkingLot.Fee;

import ParkingLot.Ticket;

import java.util.Date;

public interface FairCalculationStrategy {
    double calculateParkingFee(Ticket ticket);

}