import java.util.List;

public class Admin {
    private String id;
    private String name;
    private String role;

    public Admin(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver, boolean activate) {
        driver.setAvailable(activate);
    }

    public void viewTripHistory(List<Trip> trips) {
        // Display trip history for admin
        for (Trip trip : trips) {
            System.out.println(trip.toString());
        }
    }

    public void handleDispute(Rider rider, Driver driver) {
        // Handle disputes between riders and drivers
        System.out.println("Handling dispute between Rider " + rider.getName() + " and Driver " + driver.getName());
    }

    // Getters and setters
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
