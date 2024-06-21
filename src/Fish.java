public class Fish extends Animal{
    //variables
    private String innerType;
    private boolean jawed;
    private double finLength;

    //constructor
    public Fish(String animalName, String animalType, int animalCount, boolean special, double avgWeight, double avgHeight, String innerType, boolean jawed, double finLength) {
        super(animalName, animalType, animalCount, special, avgWeight, avgHeight);
        this.innerType = innerType;
        this.jawed = jawed;
        this.finLength = finLength;
    }

    //get and set methods
    public String getInnerType() {return innerType;}
    public boolean getJawed() {return jawed;}
    public double getFinLength() {return finLength;}


    public void setInnerType(String innerType) {this.innerType = innerType;}
    public void setJawed(boolean jawed) {this.jawed = jawed;}
    public void setFinLength(double finLength) {this.finLength = finLength;}
    

    public String printFish() {
        return String.format("name: %s \ntype: %s \ninnerType: %s \nnumber: %d \nAvgHeight: %f \nAvgWeight: %f\nfinLength: %f\n\n",
                getAnimalName(), getAnimalType(), getInnerType(), getAnimalCount(), getAvgHeight(), getAvgWeight(), getFinLength());
    }
}
