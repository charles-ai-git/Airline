import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {
    // Fields
    private String flightNumber;
    private Aircraft aircraft;
    private Airport departureLocation;
    private Airport destinationLocation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String status;

    // Constructor
    public Flight(String flightNumber, Aircraft aircraft, Airport departureLocation, Airport destinationLocation, LocalDateTime departureTime, LocalDateTime arrivalTime, String status) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
    }

    // Getters
    public String getFlightNumber(){
        return flightNumber;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public Airport getDepartureLocation() {
        return departureLocation;
    }

    public Airport getDestinationLocation() {
        return destinationLocation;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public String getStatus () {
        return status;
    }

    // Setters

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setPlane(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void setDepartureLocation(Airport departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setDestinationLocation(Airport destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setStatus(String remark) {
        this.status = status;
    }
}

