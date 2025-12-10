import java.time.LocalDate;

public class Book {
    // Fields
    private Flight flight;
    private String reservationNumber;
    private LocalDate dateReservation;
    private String status;

    // Constructor
    public Book(Flight flight, String reservationNumber, LocalDate dateReservation, String status) {
        this.flight = flight;
        this. reservationNumber = reservationNumber;
        this.dateReservation = dateReservation;
        this.status = status;
    }

    // Getters
    public Flight getFlight() {
        return flight;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
