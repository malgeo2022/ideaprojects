import java.util.ArrayList;
import java.util.Scanner;

public class UsersDAO {


    Scanner scan = new Scanner(System.in);
    ArrayList<Users> users = new ArrayList<>();


    void makeUser() {
        System.out.println("Provide your id :");
        int id = Integer.valueOf(scan.nextLine());
        System.out.println("Provide your firstName :");
        String firstName = scan.nextLine();
        System.out.println("Provide your lastName :");
        String lastName = scan.nextLine();
        System.out.println("Provide your Position:");
        users.add(new Users(id, firstName, lastName, UserType.valueOf(scan.nextLine())));
        System.out.println("User saved !");
    }


    void showListOfUsers() {
        for (Users list : users) {
            System.out.println(list);
        }
    }

    public Users searchUsers(int id) {
        if (this.users.size() == 0) {
            return null;
        }

        for (int i = 0; i <= this.users.size(); i++) {
            if (this.users.get(i).getId() == id) {
                return this.users.get(i);
            }
        }
        return null;
    }


    void findUser() {
        System.out.println("give repair id");
        int id = scan.nextInt();

        Users result = this.searchUsers(id);

        System.out.println(result);
    }
}
