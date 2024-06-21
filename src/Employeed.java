public class Employeed extends HigherDiploma{
    private String organization;
    private int jobExperiment;
    private String jobPosition;
    public Employeed(String firstName, String lastName, String ID, String education, String ethnicity, boolean gender, Date birthDate, double salary, String jobName, boolean isEmployeed,
                    String major, String university, String organization, int jobExperiment, String jobPosition) {
        super(firstName, lastName, ID, education, ethnicity, gender, birthDate, salary, jobName, isEmployeed, major, university);
        this.organization = organization;
        this.jobExperiment = jobExperiment;
        this.jobPosition = jobPosition;
    }

    public String getOrganization() {return organization;}
    public int getJobExperiment() {return jobExperiment;}
    public String getJobPosition() {return jobPosition;}

    public void setOrganization(String organization) {this.organization = organization;}
    public void setJobExperiment(int jobExperiment) {this.jobExperiment = jobExperiment;}
    public void setJobPosition(String jobPosition) {this.jobPosition = jobPosition;} // should be set by year
    
    
    public String printEmployed() {
        return String.format("firstName:%s \nlastName: %s \nID: %s \nmale: %b \neducation: %s \nbirthdate: %s \nethnicity: %s \nemployed: %b \njob: %s\nsalary: %f \nmajor: %s \nuniversity: %s \norganisation: %s" +
                        "jobPosition: %d \njobExperiment: %s\n\n", getFirstName(), getLastName(),
                getID(), isGender(), getEducation(), getBirthDate().printBirthDate(), getEthnicity(), isEmployeed(), getJobName(), getSalary(), getMajor(), getUniversity(),
                getOrganization(), getJobExperiment(), getJobPosition());
    }
}
