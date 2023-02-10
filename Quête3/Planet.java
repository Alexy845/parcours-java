package Quête3;
public class Planet extends CelestialObject {
    private Star centerStar;
    
    public Star getCenterStar() {
        return centerStar;
    }
    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }
    public Planet() {
        super();
        this.centerStar = new Star();
    }
    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((centerStar == null) ? 0 : centerStar.hashCode());
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
        Planet other = (Planet) obj;
        if (centerStar == null) {
            if (other.centerStar != null)
                return false;
        } else if (!centerStar.equals(other.centerStar))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return getName() + " circles around " + centerStar.getName() + " at the " + String.format("%.3f", getDistanceBetween(this, centerStar)) + " AU";
    }
    

}
