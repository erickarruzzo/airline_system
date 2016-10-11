package airlinesystem.model.entity.airline;

import airlinesystem.model.entity.seat.Seat;

/*
Classe voo esta relacionada ao ticket que um passageiro compra
*/
public class Flight 
{  
    private int id;
    private Route route;
    private int number;
    private Seat seat;
    
    public Flight(Route route, int number)
    {
        this.route = route;
        this.number = number;
    }

    public Route getRoutes() 
    {
        return this.route;
    }

    public void setRoutes(Route route) 
    {
        this.route = route;
    }

    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }
}
