public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    
    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
    public CelestialObject() {
        this("Soleil", 0, 0, 0);
    }
    
}

