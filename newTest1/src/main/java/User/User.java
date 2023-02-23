package User;

public class User {
   private String firstName;
   private String lastName;
   private String Role;
   private int id;

   @Override
   public String toString() {
      return "User{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", Role='" + Role + '\'' +
              ", id=" + id +
              '}';
   }

   public User(String firstName, String lastName, String role, int id) {
      this.firstName = firstName;
      this.lastName = lastName;
      Role = role;
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getRole() {
      return Role;
   }

   public void setRole(String role) {
      Role = role;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
}
