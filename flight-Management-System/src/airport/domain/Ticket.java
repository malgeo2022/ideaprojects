package airport.domain;


import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private int id;
    private String flightName;
    private double cost;
    private String passName;
    private List<Ticket> passenger = new ArrayList<>();

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Ticket> getPassenger() {
        return passenger;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public void setPassenger(List<Ticket> passenger) {
        this.passenger = passenger;
    }

    public void addPassenger(Ticket passenger) {
        this.passenger.add(passenger);
    }

    public Ticket(int id,String flightName,String passName,double cost){
        this.id = id;
        this.flightName = flightName;
        this.cost = cost;
        this.passName = passName;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", flightName='" + flightName + '\'' +
                ", cost=" + cost +
                ", passName='" + passName + '\'' +
                ", passenger=" + passenger +
                '}';
    }
}
