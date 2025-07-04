package BookMyShow.Booking;

import BookMyShow.Movie;
import BookMyShow.Seat.Seat;
import BookMyShow.Show;
import BookMyShow.User;

import java.util.List;

public class Booking {
    private String bookingId;
    private User user;
    private Show show;
    private List<Seat> seatsSelected;
    private Movie movie;
    private double price;
    private BookingStatus bookingStatus;

    public Booking(String bookingId, User user, Show show, List<Seat> seatsSelected, Movie movie, double price, BookingStatus bookingStatus) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seatsSelected = seatsSelected;
        this.movie = movie;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeatsSelected() {
        return seatsSelected;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getPrice() {
        return price;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
}
