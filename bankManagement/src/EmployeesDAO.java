import java.util.ArrayList;
import java.util.Scanner;

public class EmployeesDAO {
    Scanner scan = new Scanner(System.in);
    ArrayList<Employees> employees = new ArrayList<>();

    public void addEmployees(Employees employees) {
        this.employees.add(employees);
    }

    public void findEmployee(){
        // find a method that finds objects on the list!!!!
    }

    public void seeEmployeeList(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

}
