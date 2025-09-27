package parkingLotSystem.parkingSpotSystem;

import parkingLotSystem.Vehicle.Vehicle;

public class MiniTruckSpot extends ParkingSpot{

    MiniTruckSpot(Vehicle vehicle) {
        super(VehicleSize.LARGE, vehicle);
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
