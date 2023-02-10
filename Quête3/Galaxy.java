package Quête3;
import java.util.ArrayList;
import java.util.List;


public class Galaxy {
    private List<CelestialObject> celestialObjects;


    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public Galaxy() {
        this.celestialObjects = new ArrayList<CelestialObject>();
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.add(celestialObject);
    }
}
