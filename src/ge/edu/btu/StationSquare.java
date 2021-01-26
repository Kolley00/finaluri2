package ge.edu.btu;

public class StationSquare {

    public static void main(String[] args) {


        Passenger Gio = new Passenger("Gio", true);
        Passenger Nika = new Passenger("Nika", false);
        Passenger Ana = new Passenger("Ana", true);

        Train train = new Train();


        train.addPassenger(Gio);
        train.addPassenger(Nika);
        train.addPassenger(Ana);

        for (Passenger passenger:train.getPassengerList()) {
            System.out.println(passenger.getName());
        }

    }
}
