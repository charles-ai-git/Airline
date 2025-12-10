public class Airport {
    // Fields
    private String name;
    private String city;
    private String description;

    // Constructor
    public Airport(String name, String city, String description) {
        this.name = name;
        this.city = city;
        this.description = description;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    
}
