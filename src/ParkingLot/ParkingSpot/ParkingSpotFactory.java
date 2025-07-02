package ParkingLot.ParkingSpot;

public class ParkingSpotFactory {
    public static ParkingSpot createParkingSpot(ParkingSpotType parkingSpotType, String spotId){
        return switch (parkingSpotType){
            case CAR -> new CarSpot(spotId);
            case Bike -> new BikeSpot(spotId);
            case TRUCK -> null;
            default -> throw new IllegalArgumentException("Unknown parking spot type: " + parkingSpotType);
        };
    }
}
