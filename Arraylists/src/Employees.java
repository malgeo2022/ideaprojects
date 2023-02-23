import java.util.Objects;

public class Employees extends Users{

    int id;
    String firstName;
    String lastName;
    UserType type;

    @Override
    public UserType getType() {
        return type;
    }

    @Override
    public void setType(UserType type) {
        this.type = type;
    }

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

    public Employees(int id, String firstName, String lastName, int id1, String firstName1, String lastName1) {
        super(id, firstName, lastName, UserType.EMPLOYEE);
        this.id = id1;
        this.firstName = firstName1;
        this.lastName = lastName1;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        if (!super.equals(o)) return false;
        Employees employees = (Employees) o;
        return getId() == employees.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }
}
