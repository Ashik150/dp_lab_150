public class BikeRide implements RideType{
    @Override
    public double calc_Fare(double distance) {
        return distance * 1.5;
    }
}
