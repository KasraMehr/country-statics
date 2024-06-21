public class Medical extends Plants{
    private String useCase;// darooii behdashti zibaii
    private String useSection;// rishe saghe golbarg

    
    public Medical(String plantType, String innerType, String season, boolean isSpecial, int number, Location location, String useCase, String useSection) {
        super(plantType, innerType, season, isSpecial, number, location);
        this.useCase = useCase;
        this.useSection = useSection;
    }

    public String getUseCase() {return useCase;}

    public String getUseSection() {return useSection;}

    public void setUseCase(String useCase) {this.useCase = useCase;}

    public void setUseSection(String useSection) {this.useSection = useSection;}
    
    
    public String printMedical() {
        return String.format("type: %s \ninnerType: %s \nuseCase: %s \nuseSection: %s \nseason: %s \nspecial: %b \ncount: %d \nlocation: %s\n\n",
                getPlantType(), getInnerType(), getUseCase(), getUseSection(), getSeason(), getIsSpecial(), getNumber(), getLocation().printLocation());
    }
}
