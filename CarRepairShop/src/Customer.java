public class Customer {

    private String firstName;
    private String lastName;
    private int id;
    private String Brand;
    private String model;

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Customer(String firstName, String lastName, int id, String brand, String model) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        Brand = brand;
        this.model = model;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
