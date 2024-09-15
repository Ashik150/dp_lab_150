public class Trip {
    private String id;
    private Rider rider;
    private Driver driver;
    private Location pickupLocation;
    private Location dropOffLocation;
    private RideType rideType;
    private double fare;
    private double distance;
    private TripStatus status;

    public Trip(Rider rider, Location pickupLocation, Location dropOffLocation, RideType rideType) {
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.status = TripStatus.PENDING;
        calculateFare();
    }

    public void calculateFare() {
        this.distance = Location.calculateDistance(pickupLocation, dropOffLocation);
        this.fare = rideType.calc_Fare(distance);
    }

    public void start() {
        this.status = TripStatus.ONGOING;
        NotificationService.sendNotification("Trip started.", rider, NotificationType.IN_APP);
    }

    public void complete() {
        this.status = TripStatus.COMPLETED;
        NotificationService.sendNotification("Trip completed.", rider, NotificationType.IN_APP);
    }

    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.processPayment(fare);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(Location dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public RideType getRideType() {
        return rideType;
    }

    public void setRideType(RideType rideType) {
        this.rideType = rideType;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }
}
