class TravelBooking {
    void searchFlights(String destination) {
        System.out.println("Searching flights from Delhi to " + destination);
    }
    
    void searchHotels(String destination) {
        System.out.println("Searching hotels in " + destination + " near the main market");
    }
    
    void bookFlight(String flightDetails) {
        System.out.println(flightDetails + " flight booked successfully. Enjoy your trip!");
    }
    
    void cancelFlight(String flightDetails) {
        System.out.println("Your " + flightDetails + " flight has been cancelled.");
    }
    
    void bookHotel(String hotelDetails) {
        System.out.println("Hotel " + hotelDetails + " has been booked for your stay.");
    }
    
    void cancelHotel(String hotelDetails) {
        System.out.println("Your booking at " + hotelDetails + " has been cancelled.");
    }
}

public class Main {
    public static void main(String[] args) {
        TravelBooking booking = new TravelBooking();
        
        booking.searchFlights("Goa");
        booking.searchHotels("Goa");
        
        booking.bookFlight("Flight AI202: Delhi to Goa");
        booking.bookHotel("The Leela Resort: Goa");
        
        booking.cancelFlight("Flight AI202: Delhi to Goa");
        booking.cancelHotel("The Leela Resort: Goa");
    }
}
