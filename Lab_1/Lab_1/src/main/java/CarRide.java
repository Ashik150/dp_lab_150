public class CarRide implements RideType{
    @Override
    public double calc_Fare(double distance)
    {
        return distance * 2;
    }

}
