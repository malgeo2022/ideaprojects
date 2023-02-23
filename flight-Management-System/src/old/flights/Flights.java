package old.flights;

import old.prntMenus.Menus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flights {
    private int seats;
    private int passengers;
    private int flightID;
    private static int id = 100;
    private String flightName;
    public double traveltime;
    public double arrival;


    public Flights(int seats, int passengers, int flightID, String flightName,double traveltime,double arrival){
        id++;
        this.seats = seats;
        this.passengers = passengers;
        this.flightID = id;
        this.flightName = flightName;
    }


    public static void flightInfo(){
        Flights flightOne = new Flights(150,80,100,"Athens",2.55,23.00);
        Flights flightTwo = new Flights(150,43,100,"Thessaloniki",3.10,21.00);
        Flights flightThree = new Flights(150,28,100,"Kalamata",1.20,17.00);
        Flights flightFour = new Flights(150,67,100,"Mykonos",0.50,14.00);

        List<Flights> executions = new ArrayList<>();
        executions.add(flightOne);
        executions.add(flightTwo);
        executions.add(flightThree);
        executions.add(flightFour);
        System.out.println("*******************------------------**************");
        System.out.println("---------- -----------Flight MENU -----------------");
        System.out.println(". Choose your flight :  ");
        System.out.println();
        Iterator itr = executions.iterator();
        while(itr.hasNext()){
            Flights flights1 = (Flights) itr.next();
            System.out.println();
            System.out.println("Flight Seats : " + flights1.seats + "\nPassengers : " + flights1.passengers + "\nFlights id : " + flights1.flightID + "\nName : " + flights1.flightName );

        }
        System.out.println();
        System.out.println("Enter flight Number :  ");
        System.out.println("1. Athens :  ");
        System.out.println("2. Thessaloniki :  ");
        System.out.println("3. Kalamata :  ");
        System.out.println("4. Mykonos :  ");
        Menus.chooseFlights();


    }

}
