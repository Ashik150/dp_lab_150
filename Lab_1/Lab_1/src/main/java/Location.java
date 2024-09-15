public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static double calculateDistance(Location loc1, Location loc2) {
        // Simple distance calculation (can be improved)
        double latDiff = loc1.latitude - loc2.latitude;
        double lonDiff = loc1.longitude - loc2.longitude;
        return Math.sqrt(latDiff * latDiff + lonDiff * lonDiff);
    }

    // Getters and setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
