package old.airportManagment;

import old.Users.Employees;
import old.flights.Flights;
import old.prntMenus.Menus;

import java.util.Scanner;

public class Management {


    public static void main(String[] args){

        Menus.printUserMenu();
        Scanner input = new Scanner(System.in);
        int choose = 0;
        choose = input.nextInt();
        switch (choose){
            case 1:
                Employees.EmployeeUserMenu();
                System.out.println("**************---WELCOME EMPLOYEE---**************");
                System.out.println("");
                Employees.passengerInfo();
            break;
            case 2:
                Menus.Menus();
                System.out.println("*******************------------------**************");
                Flights.flightInfo();
                break;
            default :

        }




    }
}
