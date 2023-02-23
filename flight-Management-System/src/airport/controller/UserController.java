package airport.controller;

import airport.domain.Flight;
import airport.domain.Ticket;
import airport.domain.User;
import airport.domain.enumerator.UserType;
import airport.service.FlightService;
import airport.service.TicketService;

import java.util.Scanner;

public class UserController {
    FlightService flightService = new FlightService();
    TicketService ticketService = new TicketService();
    private String answer;


    public void passengerMenu() {
        System.out.println("**************---WELCOME PASSENGER---**************");
        System.out.println("");
        System.out.println("Enter your actions :");
        System.out.println(" ");
        System.out.println("1.book a flight :");
        System.out.println(" ");
        System.out.println("2.book your Ticket :");
        System.out.println(" ");
        System.out.println("0. Exit ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1) {
            bookFlight();
        } else if (choice == 2) {
            System.out.println("Book your ticket for the flight you chose please :");
            bookTicket();
        } else {
            System.out.println("Thank you ! ");
        }

    }

    public void employeeMenu() {
        System.out.println("**************---WELCOME EMPLOYEE---**************");
        System.out.println("");
        System.out.println("Enter your actions :");
        System.out.println(" ");
        System.out.println("1.find flight :");
        System.out.println(" ");
        System.out.println("2.Find Tickets :");
        System.out.println(" ");
        System.out.println("0. Exit ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1) {
            printPassengersPerFlight();
        } else if (choice == 2) {
            printTicketsPerFlight();
        } else {
            System.out.println("Thank you ! ");
        }
    }

    private void printPassengersPerFlight() {
        System.out.println("Give Flight id :");
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        int flightId = scan.nextInt();

        Flight flight = flightService.findById(flightId);
        System.out.println(flight.toString());
    }

    private void printTicketsPerFlight() {
        //DONE : Prints the tickets as Passengers !
        System.out.println("Give Tickets Flights id : \n1.Athens \n2.Thessaloniki \n3.Kalamata \n4.Myconos ");
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        int ticketId = scan.nextInt();

        Ticket ticket = ticketService.findById(ticketId);
        System.out.println(ticket.toString());

    }

    private void bookFlight() {
        // DONE: Ask passengers info and replace dummy values
        System.out.println("Give Flight id :");
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        int flightId = scan.nextInt();
        Flight flight = flightService.findById(flightId);
        System.out.println("Give your Personal information :");
        System.out.println(" ");
        System.out.println("Personal ID and your Name and Last Name please :");
        System.out.println(" ");
        User passenger = new User(scan.nextLong(), scan.next(), scan.next(), UserType.PASSENGER);
        flight.addPassenger(passenger);
        flightService.save(flight);
        System.out.println("Passenger saved !");
        System.out.println(" ");
        System.out.println("Do you want to Book your ticket for the flight you chose now ? ");
        System.out.println(" ");
        System.out.println("To Continue Y or N");
        Scanner scan1 = new Scanner(System.in);
        answer = scan1.next().toLowerCase();
        if (!answer.equalsIgnoreCase("n")) {
            bookTicket();
        } else {
            System.out.println("Exiting System !");
        }
    }

    private void bookTicket(){
        // DONE: AFTER PASSENGER CHOSE FLIGHT TIME FOR TICKET
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Tickets Flights id : \n1.Athens \n2.Thessaloniki \n3.Kalamata \n4.Myconos ");
        System.out.println(" ");
        int ticketsId = scanner.nextInt();
        Ticket ticket = ticketService.findById(ticketsId);
        System.out.println(" ");
        System.out.println("Add Flights ID Flights Name - your Name and The amount please :");
        System.out.println(" ");
        Ticket passenger = new Ticket(scanner.nextInt(),scanner.next(),scanner.next(),scanner.nextDouble());
        ticket.addPassenger(passenger);
        ticketService.save(ticket);
        System.out.println("Ticket saved !");
    }
}
