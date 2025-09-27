package parkingLotSystem.parkingSpotSystem;

public enum VehicleSize {

    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    final String size;

    VehicleSize(String size){
        this.size = size;
    }
    public String getSize() {
        return size;
    }

}
