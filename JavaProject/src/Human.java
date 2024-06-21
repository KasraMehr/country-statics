import java.io.Serializable;

public abstract class Human implements Serializable , Gender {
    // class variables
    private final String firstName;
    private final String lastName;
    private final String ID;
    private String education;
    private final boolean gender;
    private String ethnicity;
    private final Date birthDate;
    private double salary;
    private String jobName;
    private boolean isEmployeed;

    //constructor
    public Human(String firstName, String lastName, String ID, String education,String ethnicity, boolean gender, Date birthDate, double salary, String jobName, boolean isEmployeed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.education = education;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.birthDate = birthDate;
        this.salary = salary;
        this.jobName = jobName;
        this.isEmployeed = isEmployeed;
    }

    // get and set methods
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getID() {return ID;}
    public boolean isGender() {return gender;}
    public String getEducation() {return education;}
    public Date getBirthDate() {return birthDate;}
    public String getEthnicity() {return ethnicity;}

    public boolean isEmployeed() {return isEmployeed;}

    public double getSalary() {return salary;}

    public String getJobName() {return jobName;}
    public void setEmployeed(boolean employeed) {isEmployeed = employeed;}

    public void setEthnicity(String ethnicity) {this.ethnicity = ethnicity;}

    public void setJobName(String jobName) {this.jobName = jobName;}

    public void setSalary(double salary) {this.salary = salary;}
    
   
    public String printHuman() {
        return String.format("firstName:%s \nlastName: %s \nID: %s \nmale: %b \neducation: %s \nbirthdate: %s \nethnicity: %s \nemployed: %b \njob: %s\nsalary: %f\n\n", getFirstName(), getLastName(),
                getID(), isGender(), getEducation(), getBirthDate().printBirthDate(), getEthnicity(), isEmployeed(),getJobName(), getSalary());
    }

}
