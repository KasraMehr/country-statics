import java.io.Serializable;

public class Date implements Serializable {
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int deathYear;
    private int deathMonth;
    private int deathDay;
    private String birthDate;
    private String deathDate;
    private boolean life;

    public Date(int birthYear, int birthMonth, int birthDay){ // give 0 to death day and month and year
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        setBirthDate(birthYear, birthMonth, birthDay);
        this.deathYear = 0;
        this.deathMonth = 0;
        this.deathDay = 0;
        setDeathDate(deathYear,deathMonth,deathDay);
        this.life = true;
    }

    public void setBirthDate(int birthYear, int birthMonth, int birthDay){
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.birthDate = Integer.toString(birthYear) + "/" + Integer.toString(birthMonth) + "/" + Integer.toString(birthDay);
        this.life = true;
    }


    public int getBirthYear() {
        return birthYear;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public int getBirthDay() { return birthDay; }
    public String printBirthDate() {return birthDate;}


    public void setDeathDate(int deathYear, int deathMonth, int deathDay){
        this.deathDay = deathDay;
        this.deathMonth = deathMonth;
        this.deathYear = deathYear;
        this.deathDate = Integer.toString(deathYear) + "/" + Integer.toString(deathMonth) + "/" + Integer.toString(deathDay);
        this.life = false;
    }

    public int getDeathYear() {
        return deathYear;
    }
    public int getDeathMonth() {
        return deathMonth;
    }
    public int getDeathDay() { return deathDay; }
    public String getDeathDate() {return deathDate;}
    public boolean getLife() {
        return life;
    }
}


