import java.util.ArrayList;
import java.util.List;

public class OilServicesImpl implements OilServicesDAO {

    List<House> houses;


    public OilServicesImpl() {
        houses = new ArrayList<House>();
        House house = new House(102,12000,12760,2000,112.0);
        houses.add(house);

    }

    public List<House> getAllHouses(){
        return houses;
    }
}
