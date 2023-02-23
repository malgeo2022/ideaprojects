import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Controller {


    public static void main(String[] ags) {

        int choice = -1;

        while (choice != 0) {
                printMenu();
                choice = readChoice();

            switch (choice) {
                case 1:
                    UserServices.printAdminMenu();
                    break;
                case 2:
                    UserServices.printEmployeeMenu();
                    break;
                default:
                    break;

            }
        }
    }

    protected static void printMenu() {
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("---------- MAIN MENU ----------");
        System.out.println("*******************************");
        System.out.println("Welcome to System Log in : ");
        System.out.println("1. Admin:");
        System.out.println("2. Employee:");
        System.out.println("0. for Exit");
    }

    private static int readChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
