package airlinesystem.model.entity.airline;

import airlinesystem.model.entity.seat.Seat;
import java.util.GregorianCalendar;
import java.util.List;

public class Airplane 
{
    private List<Seat> seats;
    private int airplaneNumber;
    private int id;
    
    public Airplane(int airplaneNumber, List<Seat> seats, String company, String model, GregorianCalendar manufacturingDate)
    {
        this.airplaneNumber = airplaneNumber;
        this.seats = seats;
    }

    public Airplane(int airplaneNumber, List<Seat> seats, String company, String model)
    {
        this.airplaneNumber = airplaneNumber;
        this.seats = seats;
    }

    public int getAirplaneNumber() 
    {
        return airplaneNumber;
    }

    public void setAirplaneNumber(int airplaneNumber) 
    {
        this.airplaneNumber = airplaneNumber;
    }

    public List<Seat> getSeats() 
    {
        return seats;
    }

    public void setSeats(List<Seat> seats) 
    {
        this.seats = seats;
    }
    
}
