package parkingLotSystem.Vehicle;

import parkingLotSystem.parkingSpotSystem.*;

public class Car extends Vehicle{

    Car(String vehicleNo, VehicleSize vehicleSize, ParkingSpot parkingSpot) {
        super(vehicleNo, vehicleSize, parkingSpot);
    }

    @Override
    public VehicleSize getVehicleSize() {
        return this.vehicleSize;
    }

    @Override
    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }
}
