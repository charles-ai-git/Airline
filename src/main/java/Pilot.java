import java.time.Duration;
import java.time.LocalDate;

public class Pilot extends Employee {
    // Fields
    private String license;
    private Duration flightTime;

    // Constructor
    public Pilot(String id, String name, String address, String contact, String employeeId, LocalDate dateOfHire, String license, Duration flightTime) {
        super(id, name, address, contact, employeeId, dateOfHire);
        this.license = license;
        this.flightTime = flightTime;
    }

    // Getters
    public String getLicense() {
        return license;
    }

    public Duration getFlightTime() {
        return flightTime;
    }

    @Override
    public String getRole() {
        return "Pilot";
    }

    // Setters
    public void setFlightTime(Duration flightTime) {
        this.flightTime = flightTime;
    }


}
