public class Star extends CelestialObject {

    private double magnitude;

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    public Star() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(magnitude);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Star other = (Star) obj;
        if (Double.doubleToLongBits(magnitude) != Double.doubleToLongBits(other.magnitude))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getName() +" shines at the "+ String.format("%.3f", getMagnitude()) +" magnitude ";

    }
}

