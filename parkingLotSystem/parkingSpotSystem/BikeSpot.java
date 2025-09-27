package parkingLotSystem.parkingSpotSystem;

import parkingLotSystem.Vehicle.Vehicle;

public class BikeSpot extends ParkingSpot{

    BikeSpot(Vehicle vehicle) {
        super(VehicleSize.SMALL, vehicle);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean unpark() {
        return false;
    }

    @Override
    public boolean park() {
        return false;
    }
}
