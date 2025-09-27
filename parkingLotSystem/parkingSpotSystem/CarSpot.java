package parkingLotSystem.parkingSpotSystem;

import parkingLotSystem.Vehicle.Vehicle;

public class CarSpot extends ParkingSpot{

    CarSpot(Vehicle vehicle) {
        super(VehicleSize.MEDIUM, vehicle);
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
