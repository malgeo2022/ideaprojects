public class Hotel {

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", employees=" + employees +
                '}';
    }

    int rooms;
    int employees;

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }


}
