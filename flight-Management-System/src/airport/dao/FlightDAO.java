package airport.dao;

import airport.domain.Flight;
import airport.domain.enumerator.Destination;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightDAO {
    private List<Flight> todaysFlights = new ArrayList<>();

    public FlightDAO() {
        Flight flight1 = new Flight(1, 100, "101", 2.5, new Date(2020, 4, 15, 18, 30), Destination.ATHENS);
        Flight flight2 = new Flight(2, 80, "102", 1, new Date(2020, 4, 15, 19, 30), Destination.THESSALONIKI);
        Flight flight3 = new Flight(3, 90, "103", 3, new Date(2020, 4, 15, 20, 0), Destination.KALAMATA);
        Flight flight4 = new Flight(4, 120, "104", 4, new Date(2020, 4, 15, 22, 15), Destination.MYKONOS);

        todaysFlights.add(flight1);
        todaysFlights.add(flight2);
        todaysFlights.add(flight3);
        todaysFlights.add(flight4);
    }

    public List<Flight> findAll() {
        return this.todaysFlights;
    }

    public Flight findById(int id) {
        for(int i = 0; i <= todaysFlights.size(); i++) {
            if(this.todaysFlights.get(i).getId() == id) {
                return this.todaysFlights.get(i);
            }
        }
        return null;
    }

    public Flight save(Flight flight) {
        for(int i = 0; i <= todaysFlights.size(); i++) {
            if(this.todaysFlights.get(i).getId() == flight.getId()) {
                this.todaysFlights.set(i, flight);
                return this.todaysFlights.get(i);
            }
        }
        return null;
    }

}
