public class Rider {
    private String id;
    private String name;
    private Location location;
    private double rating;
    private PaymentMethod preferredPaymentMethod;

    public Rider(String id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = 0.0; // Default rating
    }

    public void requestRide(Location pickup, Location dropoff, RideType rideType) {
        Trip trip = new Trip(this, pickup, dropoff, rideType);
    }

    public void rateDriver(Driver driver, double rating) {
        driver.updateRating(rating);
    }

    public void makePayment(Trip trip) {
        trip.processPayment(preferredPaymentMethod);
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

    public PaymentMethod getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(PaymentMethod preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }
}
