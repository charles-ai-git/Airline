public class Plane {
    // Fields
    private String aircraftRegistration;
    private String model;
    private int capacity;

    // Constructor
    public Plane(String aircraftRegistration, String model, int capacity) {
        this.aircraftRegistration = aircraftRegistration;
        this.model = model;
        this.capacity = capacity;
    }

    // Getters
    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    // Setters
    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
