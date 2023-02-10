import java.util.ArrayList;
import java.util.List;


public class Galaxy {
    private List<CelestialObject> CelestialObjects;


    public List<CelestialObject> getCelestialObjects() {
        return CelestialObjects;
    }

    public Galaxy() {
        CelestialObjects = new ArrayList<CelestialObject>();
    }
    
    public void addCelestialObject(CelestialObject celestialObject) {
        this.CelestialObjects.add(celestialObject);
    }
}
