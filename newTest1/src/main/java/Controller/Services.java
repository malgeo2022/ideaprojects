package Controller;

import DAO.UserDAOimpl;
import DAOinterface.UserDAO;
import User.User;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Services extends Controller {

    Scanner scanner = new Scanner(System.in);

        UserDAO userDAO = new UserDAOimpl();
        //System.out.print("Loading Users ......");
        //System.out.println("User : [User ID : " + user.getId() + " First Name : " + user.getFirstName() + " ]");




    public void printMenu() {
        System.out.println("+----------------------------+");
        System.out.println("|     Welcome to HR ERP      |");
        System.out.println("|      Please Log in         |");
        System.out.println("|     With Credentials       |");
        System.out.println("+----------------------------+");

        System.out.println("   1. Enter User ID.          ");
        System.out.println("   2. Enter Employee ID.         ");
        System.out.println("   3. See Users.              ");
        System.out.println("   4. Exit.     ");
        printMenu1();
    }

    public void printMenu1() throws NullPointerException{
        try {
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("Reading your choice  ");
                        User user = userDAO.getUser(choice);
                        System.out.println("User : [ ID : " + user.getId() + ", First Name : " + user.getFirstName() + " ]");
                        break;
                    case 2:
                        System.out.println("Please Enter Employee ID : ");
                        break;
                    case 3:
                        System.out.println("List of Users : ");
                        break;
                    case 4:
                        System.out.println("Exiting the System ! ");
                        break;
                    default:
                        throw new IllegalStateException(
                                "Server responded with 724 - This line should be unreachable");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice try again ");
            }
        }catch (IllegalStateException e) {
            System.out.println("Invalid choice try again ");
        }

    }
}
