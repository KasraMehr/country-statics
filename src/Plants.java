import java.io.Serializable;

public class Plants implements Serializable {
    private String plantType;
    private String innerType;
    private String season;
    private boolean isSpecial;
    private int number;
    private Location location;
    private final Date deathDate;
    public Plants(String plantType, String innerType, String season, boolean isSpecial, int number, Location location){
        this.plantType = plantType;
        this.innerType= innerType;
        this.season = season;
        this.isSpecial = isSpecial;
        this.number = number;
        this.location = location;
        this.deathDate = null;
    }

    public String getPlantType(){return plantType;}

    public String getInnerType() {return innerType;}

    public String getSeason() {return season;}

    public boolean getIsSpecial(){return isSpecial;}

    public int getNumber() {return number;}

    public Location getLocation() {return location;}


    public void setPlantType(String plantType) {this.plantType = plantType;}

    public void setInnerType(String innerType) {this.innerType = innerType;}

    public void setSeason(String season) {this.season = season;}

    public void setSpecial(boolean special) {this.isSpecial = special;}

    public void setNumber(int number) {this.number = number;}

    public void setLocation(Location location) {this.location = location;}
    
    public Date getDeathDate()
    {
        return deathDate;
    }
    
    public String printPlant() {
        return String.format("type: %s \ninnerType: %s \nseason: %s \nspecial: %b \ncount: %d \nlocation: %s\n\n",
                getPlantType(), getInnerType(), getSeason(), getIsSpecial(), getNumber(), getLocation().printLocation());
    }

}
