import java.io.Serializable;

public class LandSources implements Serializable {

    private String landType;
    private String innerLandType;
    private String typeName;
    private double height;
    private double area;
    private int number;
    private final boolean isSpecial;
    private final Location location;
    private Date deathDate;
    
    public LandSources(String landType, String innerLandType, String typeName, double height, double area, int number, boolean isSpecial, Location location){
        this.landType = landType;
        this.innerLandType = innerLandType;
        this.typeName = typeName;
        this.height = height;
        this.area = area;
        this.number = number;
        this.isSpecial = isSpecial;
        this.location = location;
    }

    public String getLandType(){return landType;}

    public String getInnerLandType() {return innerLandType;}

    public String getTypeName() {return typeName;}
    public double getHeight() {return height;}

    public double getArea() {return area;}

    public int getNumber() {return number;}

    public Location getLocation() {return location;}

    public boolean getIsSpecial(){return isSpecial;}


    public void setLandType(String landType) {
        this.landType = landType;
    }

    public void setInnerLandType(String innerLandType) {this.innerLandType = innerLandType;}

    public void setTypeName(String typeName) {this.typeName = typeName;}

    public void setHeight(double height) {this.height = height;}

    public void setArea(double area) {this.area = area;}

    public void setNumber(int number) {this.number = number;}
    
    public Date getDeathDate()
    {
        return deathDate;
    }
    
    
    public String printLandSource() {
        return String.format("Type: %s \ninnerType: %s \nname: %s \nheight: %f \narea: %f \ncount: %d \nLocation: %s\n\n",
                getLandType(), getInnerLandType(), getTypeName(), getHeight(), getArea(), getNumber(), getLocation().printLocation());
    }
}
