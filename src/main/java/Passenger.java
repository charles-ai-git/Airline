public class Passenger extends Person {
    // Fields
    private String passportId;

    // Constructor
    public Passenger(String id, String name, String address, String contact, String passportId) {
        super(id, name, address, contact);
        this.passportId = passportId;
    }

    // Getter
    public String getPassportId() {
        return passportId;
    }

    // Setter
    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }
}
