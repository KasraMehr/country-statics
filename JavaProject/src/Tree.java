public class Tree extends Plants{
    private double height;
    private int growthRate;
    private boolean hasFruit;
    private String fruitName;

    
    public Tree(String plantType, String innerType, String season, boolean isSpecial, int number, Location location, double height, int growthRate, boolean hasFruit, String fruitName) {
        super(plantType, innerType, season, isSpecial, number, location);
        this.height = height;
        this.growthRate = growthRate;
        this.hasFruit = hasFruit;
        this.fruitName = fruitName;
    }

    public double getHeight() {return height;}
    public int getGrowthRate() {return growthRate;}

    public boolean getHasFruit() {return hasFruit;}

    public String getFruitName() {return fruitName;}


    public void setGrowthRate(int growthRate) {this.growthRate = growthRate;}
    public void setHeight(double height) {this.height = height;}

    public void setFruitName(String fruitName) {this.fruitName = fruitName;}

    public void setHasFruit(boolean hasFruit) {this.hasFruit = hasFruit;}
    
    
    public String printTree() {
        return String.format("type: %s \ninnerType: %s \nseason: %s \nspecial: %b \ncount: %d \nlocation: %s\n\n",
                getPlantType(), getInnerType(), getSeason(), getIsSpecial(), getNumber(), getLocation().printLocation());
    }
}
