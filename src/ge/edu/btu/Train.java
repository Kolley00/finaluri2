package ge.edu.btu;

import java.util.List;

public class Train {

    List<Passenger> passengerList;

    public Train() {

    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }
}
