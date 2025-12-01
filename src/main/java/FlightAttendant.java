import java.time.LocalDate;

public class FlightAttendant extends Employee {
    // Fields
    private String qualification;

    // Constructor
    public FlightAttendant(String id, String name, String address, String contact, String employeeId, LocalDate dateOfHire, String qualification) {
        super(id, name, address, contact, employeeId, dateOfHire);
        this.qualification = qualification;
    }

    // Getter
    public String getQualification() {
        return  qualification;
    }

    @Override
    public String getRole() {
        return "Flight Attendant";
    }

    // Setter
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
