package airport.domain;

import airport.domain.enumerator.Destination;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
    private int id;
    private int noOfSeats;
    private String name;
    private double travelTime;
    private Date timeOfArrival;
    Destination destination;
    private List<User> passengers = new ArrayList<>();

    public Flight(int id, int noOfSeats, String name, double travelTime, Date timeOfArrival, Destination destination) {
        this.id = id;
        this.noOfSeats = noOfSeats;
        this.name = name;
        this.travelTime = travelTime;
        this.timeOfArrival = timeOfArrival;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public Date getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(Date timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public List<User> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<User> passengers) {
        this.passengers = passengers;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void addPassenger(User passenger) {
        this.passengers.add(passenger);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", noOfSeats=" + noOfSeats +
                ", name='" + name + '\'' +
                ", travelTime=" + travelTime +
                ", timeOfArrival=" + timeOfArrival +
                ", destination=" + destination +
                ", passengers="  + passengers +
                '}';
    }
}
