public class Mammal extends Animal{
    private final boolean carnivorous;
    private final boolean domestic;
    private String innerType;


    public Mammal(String animalName, String animalType, int animalCount, boolean special, double avgWeight, double avgHight, boolean carnivorous , boolean domestic, String innerType) {
        super(animalName, animalType, animalCount, special, avgWeight, avgHight);
        this.carnivorous = carnivorous;
        this.domestic = domestic;
        this.innerType = innerType;
    }

    public boolean getCarnivorous() {return carnivorous;}

    public boolean getDomestic() {return domestic;}

    public String getInnerType() {return innerType;}

    public void setInnerType(String innerType) {this.innerType = innerType;}
    
    
    public String printMammal() {
        return String.format("name: %s \ntype: %s \ninnerType: %s \n number: %d \nAvgHeight: %f \nAvgWeight: %f \ncarnivorous: %b \ndomestic: %b\n\n", getAnimalName(), getAnimalType(), getInnerType(),
                getAnimalCount(), getAvgHeight(), getAvgWeight(), getCarnivorous(), getDomestic());
    }
}
