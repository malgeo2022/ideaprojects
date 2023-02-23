package old.prntMenus;

import old.Users.Passengers;
import java.util.Scanner;

public class Menus {

    public static void Menus() {
        System.out.println("---------- WELCOME TO UNITED AIR FLIGHTS ----------");
        System.out.println("*******************------------------**************");
        System.out.println("Provide as your Name and ID : ");
        System.out.println("");
        Passengers.passObj();
        System.out.println("Passenger saved");

    }

    private static int readChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
    public static void printUserMenu(){
        System.out.println("*******************------------------**************");
        System.out.println("---------- WELCOME TO UNITED AIR FLIGHTS ----------");
        System.out.println("*******************------------------**************");
        System.out.println("---------- -----------USER MENU -----------------");
        System.out.println(". User Log in :  ");
        System.out.println("1. EMPLOYEE ");
        System.out.println(" ");
        System.out.println("2. PASSENGER ");


    }

    public static void chooseFlights() {
        int choice = readChoice();
        switch (choice) {
            case 1:
                System.out.println("Athens");
                break;
            case 2:
                System.out.println("Thessaloniki");
                break;
            case 3:
                System.out.println("Kalamata");
                break;
            case 4:
                System.out.println("Mykonos");
                break;
            default:

        }


    }
}