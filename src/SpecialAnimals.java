public class SpecialAnimals extends Animal {
    // can have owner
    private final String name;
    private final long ID;
    private String description;
    private Date birthdate;

    public SpecialAnimals(String animalName, String animalType, int animalCount, boolean special, double avgWeight, double avgHeight, Date birthdate, String name, long ID, String description) {
        super(animalName, animalType, animalCount, special, avgWeight, avgHeight);
        this.name = name;
        this.ID = ID;
        this.description = description;
        this.birthdate = birthdate;
    }

    //get and set methods
    public String getName() {return name;}
    public long getID() {return ID;}

    public Date getBirthdate() {return birthdate;}

    public String getDescription() {return description;}

    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String printSpecialAnimal() {
        return String.format("name: %s \nsurname: %s \nID: %d \ntype: %s \nnumber: %d \nspecial: %b \nAvgHeight: %f \nAvgWeight: %f\nbirthdate: %s \ndescription: %s\n", getAnimalName(), getAnimalType(),
                getAnimalCount(), isSpecial(), getAvgHeight(), getAvgWeight(), getBirthdate().printBirthDate(), getDescription());
    }
}
