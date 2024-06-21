public class Flower extends Plants{
    private String color;
    private int smellRate;
    private boolean usable;

    public Flower(String plantType, String innerType, String season, boolean isSpecial, int number, Location location, String color, int smellRate, boolean usable) {
        super(plantType, innerType, season, isSpecial, number, location);
        this.color = color;
        this.smellRate = smellRate;
        this.usable = usable;
    }


    public String getColor() {return color;}

    public int getSmellRate() {return smellRate;}

    public boolean isUsable() {return usable;}

    public void setColor(String color) {this.color = color;}

    public void setSmellRate(int smellRate) {this.smellRate = smellRate;}

    public void setUsable(boolean usable) {this.usable = usable;}
    
    
    public String printFlower() {
        return String.format("type: %s \ninnerType: %s \ncolor: %s \nsmellRate: %d \nusable: %b \nseason: %s \nspecial: %b \ncount: %d \nlocation: %s\n\n",
                getPlantType(), getInnerType(), getColor(), getSmellRate(), isUsable(), getSeason(), getIsSpecial(), getNumber(), getLocation().printLocation());
    }
}
