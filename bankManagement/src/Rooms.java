import java.util.ArrayList;

public class Rooms extends Hotel {

    private int fareRate;
    private int beds;
    private String view;
    private int floor;
    private String RoomClass;

    ArrayList<Rooms> rooms = new ArrayList<>();

    public Rooms() {
    }


    public Rooms(int fareRate, int beds, String view, int floor, String roomClass) {
        this.fareRate = fareRate;
        this.beds = beds;
        this.view = view;
        this.floor = floor;
        RoomClass = roomClass;
    }

    public void setRoomArrayList() {
        Rooms room1 = new Rooms(100, 1, "sea view", 2, "A");
        Rooms room2 = new Rooms(150, 2, "sea view", 2, "A");
        Rooms rooms3 = new Rooms(200, 2, "side view", 1, "B");
        Rooms rooms4 = new Rooms(200, 2, "side view", 1, "B");
        Rooms rooms5 = new Rooms(250, 3, "mountain view", 1, "C");
        this.rooms.add(room1);
        this.rooms.add(room2);
        this.rooms.add(rooms3);
        this.rooms.add(rooms4);
        this.rooms.add(rooms5);
    }


    public void seeRoomList() {
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i));
        }
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "fareRate=" + fareRate +
                ", beds=" + beds +
                ", view='" + view + '\'' +
                ", floor=" + floor +
                ", RoomClass='" + RoomClass + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
