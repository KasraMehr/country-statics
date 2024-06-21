public class Water extends LandSources{
    private boolean outside;


    public Water(String landType, String innerType, double height, double area, String typeName,int number, boolean isSpecial, Location location, boolean outside) {
        super(landType, innerType, typeName, height, area, number, isSpecial, location);
        this.outside = outside;
    }

    public boolean isOutside() {return outside;}

    public void setOutside(boolean outside) {this.outside = outside;}
    
    
    public String printWater() {
        return String.format("Type: %s \ninnerType: %s \nname: %s \nheight: %f \narea: %f \ncount: %d \noutOfCountry: %b \nLocation: %s\n\n",
                getLandType(), getInnerLandType(), getTypeName(), getHeight(), getArea(), getNumber(), isOutside(), getLocation().printLocation());
    }
}
