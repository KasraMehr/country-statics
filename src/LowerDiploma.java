public class LowerDiploma extends Human{
    private boolean athletic;
    private String sportMajor;
    private boolean underage;// means people who are under 18 years old.


    public LowerDiploma(String firstName, String lastName, String ID, String education,String ethnicity, boolean gender, Date birthDate, double salary, String jobName, boolean isEmployed,
                        boolean athletic, String sportMajor, boolean underage) {
        super(firstName, lastName, ID, education, ethnicity, gender, birthDate, salary, jobName, isEmployed);
        this.athletic = athletic;
        this.sportMajor = sportMajor;
        this.underage = underage;// should have method for getting it.
    }

    public boolean getAthletic() {return athletic;}
    public String getSportMajor() {return sportMajor;}
    public boolean getUnderage() {return underage;}

    public void setAthletic(boolean athletic) {this.athletic = athletic;}
    public void setSportMajor(String sportMajor) {this.sportMajor = sportMajor;}
    public void setUnderage(boolean underage) {this.underage = underage;}
    
    
    public String printLowerDiploma() {
        return String.format("firstName:%s \nlastName: %s \nID: %s \nmale: %b \neducation: %s \nbirthdate: %s \nethnicity: %s \nemployed: %b \njob: %s \nsalary: %f \nathletic: %b \nunderage: %b\n\n", getFirstName(), getLastName(),
                getID(), isGender(), getEducation(), getBirthDate().printBirthDate(), getEthnicity(), isEmployeed(), getJobName(), getSalary(), getAthletic(), getSportMajor(), getUnderage());
    }
}
