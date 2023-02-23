package airport.service;

import airport.dao.FlightDAO;
import airport.domain.Flight;

public class FlightService {
    private FlightDAO flightDAO = new FlightDAO();

    public Flight findById(int id) {
        return this.flightDAO.findById(id);
    }

    public Flight save(Flight flight) {
        return flightDAO.save(flight);
    }
}
