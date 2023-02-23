import java.util.Scanner;

public class Menu {

    EmployeesDAO employeesDAO = new EmployeesDAO();

    public static void printStars(int number) {
        int[] array = {55, 55};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int value : array) {
            for (int j = 0; j < value; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printLines(int number) {
        int[] array = {55, 55};
        printArrayInLines(array);
    }

    public static void printArrayInLines(int[] array) {
        for (int value : array) {
            for (int j = 0; j < value; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public void startMenu(int number) {
        Scanner scan = new Scanner(System.in);

        System.out.println("              " + "Welcome to Prince Hotel");
        printLines(2);
        System.out.println("Enter Main Menu with your Credentials ");
        System.out.println("1.For New Employee");
        System.out.println("2.For Existing Employee");
        System.out.println("or 0 to exit");
        int value = Integer.valueOf(scan.nextLine());
        while (true) {
            if (value == 0) {
                break;
            }
            if (value < 0) {
                System.out.println("Invalid number try again!");
            }else if(value == 1) {
                makeEmployee();
            }else if(value == 2){
                employeesDAO.findEmployee();
            }
        }
        scan.close();
    }



    public void makeEmployee(){

        Scanner scan = new Scanner(System.in);
        Employees o = new Employees();
        System.out.println("Give your ID:");
        long ID = Long.valueOf(scan.nextLine());
        o.setID(ID);
        System.out.println("Give your First Name:");
        String firstName = scan.nextLine();
        o.setFirstName(firstName);
        System.out.println("Give your Last Name:");
        String lastName = scan.nextLine();
        o.setLastName(lastName);
        System.out.println("Your Mobile Phone Number:");
        long mobile = Long.valueOf(scan.nextLine());
        o.setMobileNumber(mobile);
        employeesDAO.addEmployees(o);
        System.out.println("Employee saved !");

        employeesDAO.seeEmployeeList();
        startMenu(2);
        scan.close();

    }

}
