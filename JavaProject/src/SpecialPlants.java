public class SpecialPlants extends Plants{
    private String name;
    private long ID;
    private String description;

    public SpecialPlants(String plantType, String innerType, String season, boolean isSpecial, int number, Location location, String name, String description , long ID) {
        super(plantType, innerType, season, isSpecial, number, location);
        this.name = name;
        this.ID = ID;
        this.description = description;
    }

    public String getName() {return name;}
    public long getID() {return ID;}
    public String getDescription() {return description;}


    public void setName(String name) {this.name = name;}
    public void setID(long ID) {this.ID = ID;}
    public void setDescription(String description) {this.description = description;}
    
    
    public String printSpecialPlant() {
        return String.format("type: %s \ninnerType: %s \n name: %s \nID: %d \nseason: %s \nlocation: %s \ndescription: %s\n\n",
                getPlantType(), getInnerType(), getName(), getID(), getSeason(), getLocation().printLocation(), getDescription());
    }
}
