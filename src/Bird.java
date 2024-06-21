public class Bird extends Animal{
    private String innerType;
    private double wingLength;
    public Bird(String animalName, String animalType, int animalCount, boolean special, double avgWeight, double avgHeight, String innerType, double wingLength) {
        super(animalName, animalType, animalCount, special, avgWeight, avgHeight);
        this.innerType = innerType;
        this.wingLength = wingLength;
    }

    public String getInnerType() {return innerType;}
    public double getWingLength() {return wingLength;}

    public void setInnerType(String innerType) {this.innerType = innerType;}

    public void setWingLength(double wingLength) {this.wingLength = wingLength;}
    
    

    public String printBird() {
        return String.format("name: %s \ntype: %s \ninnerType: %s \n number: %d \nAvgHeight: %f \nAvgWeight: %f \nwingLength: \n\n",
                getAnimalName(), getAnimalType(), getInnerType(), getAnimalCount(), getAvgHeight(), getAvgWeight(), getWingLength());
    }
}
