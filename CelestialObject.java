import java.util.Set;

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

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

