public class Admin extends Users{

    int id;
    String firstName;
    String lastName;
    UserType type;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public UserType getType() {
        return type;
    }

    @Override
    public void setType(UserType type) {
        this.type = type;
    }

    public Admin(int id, String firstName, String lastName, UserType type, int id1, String firstName1, String lastName1) {
        super(id, firstName, lastName, UserType.ADMIN);
        this.id = id1;
        this.firstName = firstName1;
        this.lastName = lastName1;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type=" + type +
                '}';
    }


}
