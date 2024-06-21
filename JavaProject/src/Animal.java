import java.io.Serializable;

public class Animal implements Serializable {
    // variables
    private final String animalName;
    private final String animalType;
    private static int animalCount;
    private boolean special;
    private double avgWeight;
    private double avgHeight;
    private Date deathDate;


    //constructor
    public Animal(String animalName, String animalType,int animalCount, boolean special, double avgWight, double avgHeight){
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalCount = animalCount;
        this.special = special;
        this.avgWeight = avgWight;
        this.avgHeight = avgHeight;
    }

    //get and set methods.
    public String getAnimalType() {return animalType;}
    public boolean isSpecial() {return special;}
    public String getAnimalName() {return animalName;}

    public static int getAnimalCount() {return animalCount;}

    public double getAvgWeight() {return avgWeight;}

    public double getAvgHeight() {return avgHeight;}

    public void setSpecial(boolean special) {this.special = special;}

    public static void setAnimalCount(int animalCount) {Animal.animalCount = animalCount;}

    public void setAvgWight(double avgWight) {this.avgWeight = avgWight;}

    public void setAvgHeight(double avgHeight) {this.avgHeight = avgHeight;}
    
    public Date getDeathDate()
    {
        return deathDate;
    }
    
    public String printAnimal() {
        return String.format("name: %s \ntype: %s \nnumber: %d \nspecial: %b \nAvgHeight: %f \nAvgWeight: %f\n\n", getAnimalName(), getAnimalType(), getAnimalCount(), isSpecial(), getAvgHeight(), getAvgWeight());
    }
}
