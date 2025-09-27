package parkingLotSystem.parkingSpotSystem;

import parkingLotSystem.Vehicle.Vehicle;

public abstract class ParkingSpot {
    private VehicleSize vehicleSize;
    Vehicle vehicle;

    ParkingSpot(VehicleSize vehicleSize, Vehicle vehicle){
        this.vehicleSize = vehicleSize;
        this.vehicle = vehicle;
    }

    public abstract boolean isEmpty();
    public abstract boolean unpark();
    public abstract boolean park();

}
