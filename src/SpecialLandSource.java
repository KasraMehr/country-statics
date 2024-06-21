public class SpecialLandSource extends LandSources{
    private String name;
    private String description;

    public SpecialLandSource(String landType, String innerType, double height, double area, String typeName,int number, boolean isSpecial, Location location, String name, String description) {
        super(landType, innerType, typeName, height, area, number, isSpecial, location);
        this.name = name;
        this.description = description;
    }

    public String getName() {return name;}

    public String getDescription() {return description;}

    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}
    
    
    public String printSpecialLandSource() {
        return String.format("Type: %s \ninnerType: %s \nname: %s \nsurname: %s \nheight: %f \narea: %f \ncount: %d \nLocation: %s \ndescription: %s\n\n",
                getLandType(), getInnerLandType(), getTypeName(), getName(), getHeight(), getArea(), getNumber(), getLocation().printLocation(), getDescription());
    }
}
