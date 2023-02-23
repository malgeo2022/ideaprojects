package old.Users;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passengers {
    private String firstName;
    private String lastName;
    private long id;


    public Passengers(String firstName,String lastName,long id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public long getId() {
        return this.id;
    }

    public static void passObj() {
          Scanner input = new Scanner(System.in);
          System.out.println("1. First Name  : ");
          String firstName = input.next();
          System.out.println("2. Last Name  : ");
          String lastName = input.next();
          System.out.println("3. ID ");
          long id = input.nextLong();
          List<Passengers> UserSave = new ArrayList<Passengers>();
          Passengers d = new Passengers(firstName,lastName,id);
          UserSave.add(d);
          System.out.println("First name : " + d.getFirstName() + "\n" + "Last name : " + d.getLastName() + "\n" + "Personal ID : " + d.getId());

          UserSave.lastIndexOf(d);

        }


      }





