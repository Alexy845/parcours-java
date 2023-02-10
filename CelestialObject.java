

public class CelestialObject {
    @Override
    public String toString() {
        return getName() +"is positioned at ("+ String.format("%.3f", getX()) +", "+ String.format("%.3f", getY()) +", "+ String.format("%.3f", getZ()) +")";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CelestialObject other = (CelestialObject) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
            return false;
        if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
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

