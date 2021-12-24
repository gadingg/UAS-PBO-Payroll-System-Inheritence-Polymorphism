import java.util.Date;

public class Staff extends Employee {
    double hourlyRate;

    public Staff() {
    }

    public Staff(String firstname, String lastname, String id, char sex, Date birthdate, double hourlyRate) {
        super(firstname, lastname, id, sex, birthdate);
        this.hourlyRate = hourlyRate;

    }

    @Override

    public double monthlyEarning() {
        return hourlyRate * Payroll_EmployeeInfo.STAFF_MONTHLY_HOURS_WORKED;
    }

    public double gethourlyRate() {
        return hourlyRate;
    }

    public void sethourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String toString() {
        String str = super.toString() + "\nMonthly Salary : " + monthlyEarning();
        return str;
    }

}