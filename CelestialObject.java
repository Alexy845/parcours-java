import java.util.Set;

public class CelestialObject {
    public static double KM_IN_ONE_AU = 1.5E8;
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

    public static double getDistanceBetween(CelestialObject defaultStar, CelestialObject earth){
        return Math.sqrt(Math.pow(defaultStar.getX() - earth.getX(), 2) + Math.pow(defaultStar.getY() - earth.getY(), 2) + Math.pow(defaultStar.getZ() - earth.getZ(), 2));
    }
    public static double getDistanceBetweenInKm(CelestialObject defaultStar, CelestialObject earth) {
        return getDistanceBetween(defaultStar, earth) * KM_IN_ONE_AU;
    }

}

