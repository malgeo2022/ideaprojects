package airport.dao;

import airport.domain.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketDAO {
    private List<Ticket> tickets = new ArrayList<>();

    public TicketDAO(){
        Ticket ticket1 = new Ticket(1,"Athens","",80);
        Ticket ticket2 = new Ticket(2,"Thessaloniki","",80);
        Ticket ticket3 = new Ticket(3,"Kalamata","",80);
        Ticket ticket4 = new Ticket(4,"Myconos","",80);
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
    }

    public List<Ticket> findAll() {
        return this.tickets;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public Ticket findById(int id) {
        for(int i = 0; i <= tickets.size(); i++) {
            if(this.tickets.get(i).getId() == id) {
                return this.tickets.get(i);
            }
        }
        return null;
    }

    public Ticket save(Ticket ticket) {
        for(int i = 0; i <= tickets.size(); i++) {
            if(this.tickets.get(i).getId() == ticket.getId()) {
                this.tickets.set(i, ticket);
                return this.tickets.get(i);
            }
        }
        return null;
    }

}
