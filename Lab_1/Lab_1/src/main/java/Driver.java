public class Driver {
    private String id;
    private String name;
    private VehicleType vehicleType;
    private Location location;
    private double rating;
    private boolean isAvailable;

    public Driver(String id, String name, VehicleType vehicleType, Location location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = 0.0;
        this.isAvailable = true;
    }

    public void acceptRide(Trip trip) {
        this.isAvailable = false;
        trip.setDriver(this);
    }

    public void startTrip(Trip trip) {
        trip.start();
    }

    public void updateRating(double newRating) {
        this.rating = (this.rating + newRating) / 2; // Average the rating
    }

    public void updateLocation(Location location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
