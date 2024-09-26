class CarRide extends RideType {
    public CarRide() {
        super("Car");
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }
}
