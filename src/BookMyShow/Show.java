package BookMyShow;

import BookMyShow.Seat.Seat;

import java.util.Date;
import java.util.List;

public class Show {
    private String showId;
    private Date showTime;
    private Movie movie;
    private Theater theater;
    private List<Seat> seats;
    private boolean isAvailable;

    public void bookSeat(){}

    public void cancelSeat(){}

    public List<Seat> getAvailableSeats(){
        return null;
    }

}
