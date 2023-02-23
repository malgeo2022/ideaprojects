import java.util.Scanner;

public class UserServices {

    public static void printAdminMenu() {
        UsersDAO userdao = new UsersDAO();
        System.out.println("*******************************");
        System.out.println("---------- MAIN MENU ----------");
        System.out.println("Enter your choice : ");
        System.out.println("1. for new User:");
        System.out.println("2. for All Users:");
        System.out.println("3. for Search User:");
        System.out.println("4. Return to Main Menu:");
        System.out.println("0. for Exit");

        int input = 0;
        while (input > 0) {
            input = readChoice();
            switch (input) {
                case 1:
                    userdao.makeUser();
                    break;
                case 2:
                    userdao.showListOfUsers();
                    break;
                case 3:
                    userdao.findUser();
                    break;
                case 4:
                    Controller.printMenu();
                default:
                    break;
            }
        }
    }

    public static int readChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void printEmployeeMenu() {
        System.out.println("*******************************");
        System.out.println("---------- MAIN MENU ----------");
        System.out.println("Enter your choice : ");
        System.out.println("1. for new Repair:");
        System.out.println("2. for All Repairs:");
        System.out.println("3. Search Repairs:");
        System.out.println("0. for Exit");
        int input = 0;
        while (input > 0) {
            input = readChoice();
            switch (input) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }
        }

    }
}
