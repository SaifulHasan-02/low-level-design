package parkingLotSystem.Vehicle;

import parkingLotSystem.parkingSpotSystem.ParkingSpot;
import parkingLotSystem.parkingSpotSystem.VehicleSize;

public class VehicleFactory {
    public Vehicle createVehicle( String vehicleNumber, VehicleSize vehicleSize, ParkingSpot parkingSpot){
        if(vehicleSize.equals(VehicleSize.SMALL)){
            return new Bike(vehicleNumber, vehicleSize, parkingSpot);
        } else if(vehicleSize.equals(VehicleSize.MEDIUM)){
            return new Car(vehicleNumber, vehicleSize, parkingSpot);
        } else if(vehicleSize.equals(VehicleSize.LARGE)){
            return new MiniTruck(vehicleNumber, vehicleSize, parkingSpot);
        }
        return null;
    }
}
