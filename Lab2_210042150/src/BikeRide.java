class BikeRide extends RideType {
    public BikeRide() {
        super("Bike");
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }
}
