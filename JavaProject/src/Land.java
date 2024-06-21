public class Land extends LandSources{
    private double humidityRate;


    public Land(String landType, String innerType, double height, double area, String typeName,int number, boolean isSpecial, Location location, double humidityRate) {
        super(landType, innerType, typeName, height, area, number, isSpecial, location);
        this.humidityRate = humidityRate;
    }

    public double getHumidityRate() {return humidityRate;}

    public void setHumidityRate(double humidityRate) {this.humidityRate = humidityRate;}
    
    
    public String printLand() {
        return String.format("Type: %s \ninnerType: %s \nname: %s \nheight: %f \narea: %f \ncount: %d \nhumidityRate: %f \nLocation: %s\n\n",
                getLandType(), getInnerLandType(), getTypeName(), getHeight(), getArea(), getNumber(), getHumidityRate(), getLocation().printLocation());
    }
}
