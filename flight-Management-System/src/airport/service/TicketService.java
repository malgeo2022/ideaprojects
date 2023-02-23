package airport.service;


import airport.dao.TicketDAO;
import airport.domain.Ticket;


public class TicketService {
    private TicketDAO ticketDAO = new TicketDAO();

    public Ticket findById(int id) {
        return this.ticketDAO.findById(id);
    }

    public Ticket save(Ticket ticket) {
        return ticketDAO.save(ticket);
    }


}
