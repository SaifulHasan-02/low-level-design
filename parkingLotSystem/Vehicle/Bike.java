package parkingLotSystem.Vehicle;

import parkingLotSystem.parkingSpotSystem.ParkingSpot;
import parkingLotSystem.parkingSpotSystem.VehicleSize;

public class Bike extends Vehicle{

    Bike(String vehicleNo, VehicleSize vehicleSize, ParkingSpot parkingSpot) {
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
