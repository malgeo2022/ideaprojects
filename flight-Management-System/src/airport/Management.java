package airport;

import airport.controller.UserController;
import java.util.Scanner;

public class Management {
    private static UserController userController = new UserController();

    public static void main(String[] args) {

        while(true) {
            printMenu();

            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    userController.employeeMenu();
                    break;
                case 2:
                    userController.passengerMenu();
                    break;
                default:
                    break;
            }
        }

    }

    private static void printMenu() {
            System.out.println("*******************------------------**************");
            System.out.println("---------- WELCOME TO UNITED AIR FLIGHTS ----------");
            System.out.println("*******************------------------**************");
            System.out.println("---------- -----------USER MENU -----------------");
            System.out.println(". User Log in :  ");
            System.out.println("1. EMPLOYEE ");
            System.out.println(" ");
            System.out.println("2. PASSENGER ");
    }
}
