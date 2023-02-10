package Quête3;


public class CelestialObject {
    @Override
    public String toString() {
        return getName() +" is positioned at ("+ String.format("%.3f", getX()) +", "+ String.format("%.3f", getY()) +", "+ String.format("%.3f", getZ()) +")";
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

    public static double getDistanceBetween(CelestialObject o1, CelestialObject o2) {
        double dx = o1.x - o2.x;
        double dy = o1.y - o2.y;
        double dz = o1.z - o2.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    
    public static double getDistanceBetweenInKm(CelestialObject o1, CelestialObject o2) {
        return getDistanceBetween(o1, o2) * KM_IN_ONE_AU;
    }

}

