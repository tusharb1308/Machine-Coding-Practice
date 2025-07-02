package ParkingLot.Vehicle;

public abstract class Vehicle {
    protected int id;
    protected String licensePlate;
    protected VehicleType vehicleType;

    public Vehicle(String licensePlate, VehicleType vehicleType){
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicenseNumber(){
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

}