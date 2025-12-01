import java.time.LocalDate;

public abstract class Employee extends Person {
    // Fields
    private String employeeId;
    private LocalDate dateOfHire;

    // Constructor
    public Employee(String id, String name, String address, String contact, String employeeId, LocalDate dateOfHire) {
        super(id, name, address, contact);
        this.employeeId = employeeId;
        this.dateOfHire = dateOfHire;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getDateOfHire() {
        return dateOfHire;
    }

    public abstract String getRole();

    // Setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDateOfHire(LocalDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
}
