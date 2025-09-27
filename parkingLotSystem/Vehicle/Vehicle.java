package parkingLotSystem.Vehicle;

import parkingLotSystem.parkingSpotSystem.*;

public abstract class Vehicle {
    String vehicleNo;
    VehicleSize vehicleSize;
    ParkingSpot parkingSpot;

    Vehicle(String vehicleNo, VehicleSize vehicleSize,ParkingSpot parkingSpot){
        this.vehicleNo = vehicleNo;
        this.vehicleSize = vehicleSize;
        this.parkingSpot = parkingSpot;
    }

    public abstract VehicleSize getVehicleSize();
    public abstract ParkingSpot getParkingSpot();


}
