package ge.edu.btu;

public class Passenger {

    public String name;
    public Boolean ticket;


    public Passenger(String name, boolean ticket){
        name = name;
    }

    public Boolean getTicket() {
        return ticket;
    }

    public String getName() {
        return name;
    }
}
