import java.io.Serializable;

public class Location implements Serializable {
    private String direction;
    private double distanceFromCenter;
    private String state;

    public Location(String direction, double distanceFromCenter, String state){
        this.direction = direction;
        this.distanceFromCenter = distanceFromCenter;
        this.state = state;
    }

    public String getDirection() {return direction;}

    public double getDistanceFromCenter() {return distanceFromCenter;}

    public String getState() {return state;}
    
    
    public String printLocation() {
        return String.format("%s_%s_%d", getState(), getDirection(), getDistanceFromCenter());
    }
}
