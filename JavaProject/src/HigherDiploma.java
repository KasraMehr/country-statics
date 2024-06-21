public class HigherDiploma extends Human{
    // major and university
    private static int counter;
    private String major;
    private String university;

    public HigherDiploma(String firstName, String lastName, String ID, String education,String ethnicity, boolean gender, Date birthDate, double salary, String jobName, boolean isEmployeed
     , String major, String university) {
        super(firstName, lastName, ID, education, ethnicity, gender, birthDate, salary, jobName, isEmployeed);
        this.counter++;
        this.major = major;
        this.university = university;
    }

    public int getCounter() {return counter;}
    public String getMajor() {return major;}
    public String getUniversity() {return university;}

    public void setMajor(String major) {this.major = major;}
    public void setUniversity(String university) {this.university= university;}
    
    

    public String printHigherDiploma() {
        return String.format("firstName:%s \nlastName: %s \nID: %s \nmale: %b \neducation: %s \nbirthdate: %s \nethnicity: %s \nemployed: %b \njob: %s\nsalary: %f \nmajor: %s \nuniversity: %s\n\n", getFirstName(), getLastName(),
                getID(), isGender(), getEducation(), getBirthDate().printBirthDate(), getEthnicity(), isEmployeed(), getJobName(), getSalary(), getMajor(), getUniversity());
    }
}
