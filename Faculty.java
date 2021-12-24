import java.util.Date;

public class Faculty extends Employee {

    Level level;

    Education education;

    public Faculty(String firstname, String lastname, String id, char sex, Date birthdate, Level level,
            Education education) {
        super(firstname, lastname, id, sex, birthdate);
        this.level = level;
        this.education = education;

    }

    public Faculty() {
    }

    @Override

    public double monthlyEarning() {

        if (level == Level.AS) {

            return Payroll_EmployeeInfo.FACULTY_MONTHLY_SALARY;

        } else if (level == Level.AO) {

            return (1.5 * Payroll_EmployeeInfo.FACULTY_MONTHLY_SALARY);

        } else if (level == Level.FU) {

            return (2 * Payroll_EmployeeInfo.FACULTY_MONTHLY_SALARY);
        }

        return 0;

    }

    enum Level {
        AS,
        AO,
        FU
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String toString() {
        String role = "";
        if (level == Level.AS) {
            role = "Assistant Professor";
        } else if (level == Level.AO) {
            role = "Associate Professor";
        } else if (level == Level.FU) {
            role = "Full Professor";
        }

        String str = super.toString() + "\nLevel : " + role + "\nMonthly Salary : " + monthlyEarning();
        return str;

    }

}