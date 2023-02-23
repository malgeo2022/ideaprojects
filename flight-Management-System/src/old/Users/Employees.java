package old.Users;

import old.flights.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Employees {
    private String firstName;
    private String LastName;
    private long id;

    public Employees(String firstName,String LastName,long id){
        this.firstName = firstName;
        this.LastName = LastName;
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }


    public static void EmployeeUserMenu() {
            Scanner input = new Scanner(System.in);
            System.out.println("*******************------------------**************");
            System.out.println("Provide as your Name and ID : ");
            System.out.println("");
            System.out.println("1. First Name ");
            String firstName = input.next();
            System.out.println("2. Last Name ");
            String LastName = input.next();
            System.out.println("3. ID ");
            long id = input.nextLong();
            List<Employees> employee = new ArrayList<Employees>();
            Employees r = new Employees(firstName,LastName,id);
            employee.add(r);
            System.out.println("First name : " + r.getFirstName() + "\n" + "Last name : " + r.getLastName() + "\n" + "Personal ID : " + r.getId());
        }

    public static void passengerInfo() {
        System.out.println("Enter your actions :");
        System.out.println(" ");
        System.out.println("1.find passengers :");
        System.out.println(" ");
        System.out.println("2.find Flights :");
        System.out.println(" ");
        System.out.println("3.Enter ticket number :");
        System.out.println(" ");
        System.out.println("0. Exit ");
        Scanner scan = new Scanner(System.in);
        int choice2 = scan.nextInt();
        if (choice2 == 1){
            System.out.println("Your passenger List is :");

        }else if(choice2 == 2){
            System.out.println("Your flight List is :");
            Flights.flightInfo();
        }else if(choice2 == 3){
            System.out.println("Your Ticket List is :");

        }else{
            System.out.println("Thank you ! ");
        }
    }

}
