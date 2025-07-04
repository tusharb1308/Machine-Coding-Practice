package BookMyShow;

import BookMyShow.Booking.Booking;
import BookMyShow.Seat.Seat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class MovieTicketBookingSystem {
    private static MovieTicketBookingSystem instance;
    private final List<Movie> movies;
    private final List<Theater> theaters;
    private final Map<String, Show> shows;
    private final Map<String, Booking> bookings;
    private static final String BOOKING_ID_PREFIX = "BKG";
    private static final AtomicLong bookingCounter = new AtomicLong(0);

    public MovieTicketBookingSystem() {
        this.movies = new ArrayList<>();
        this.theaters = new ArrayList<>();
        this.shows = new ConcurrentHashMap<>();
        this.bookings = new ConcurrentHashMap<>();
    }

    public static synchronized MovieTicketBookingSystem getInstance(){
        if(instance == null){
            instance = new MovieTicketBookingSystem();
        }

        return instance;
    }

    public void addMovie(){

    }

    public void addTheatre(){

    }

    public void addShow(){

    }

    public List<Movie> getMovies(){
        return null;
    }

    public List<Theater> getTheaters(){
        return null;
    }

    public Show getShow(String showId){
        return null;
    }

    public synchronized Booking bookTickets(User user, Show show, List<Seat> seatsSelected){
        return null;
    }

    private boolean areSeatsAvailable(Show show, List<Seat> seats){
        return true;
    }

    private void markSeatsAsBooked(Show show, List<Seat> seats){

    }

    private double calculateTotalPrice(List<Seat> seats){
        return 0;
    }

    private String generateBookingId(){
        return null;
    }

    public synchronized void confirmBooking(String bookingId){

    }

    public synchronized void cancelBooking(String bookingId){

    }

    public void markSeatsAvailable(Show show, List<Seat> seats){

    }

    public void addBooking(){

    }
}
