import java.util.Objects;

public class Employees {

    long ID;
    String firstName;
    String LastName;
    long mobileNumber;

    public Employees() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public Employees(int ID, String firstName, String lastName, long mobileNumber) {
        this.ID = ID;
        this.firstName = firstName;
        LastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
