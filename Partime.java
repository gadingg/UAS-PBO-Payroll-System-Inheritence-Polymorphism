
import java.util.Date;

public class Partime extends Staff {

    int HoursWorkedPerWeek;

    public Partime(String firstname, String lastname, String id, char sex, Date birthdate, double hourlyRate,
            int HoursWorkedPerWeek) {

        super(firstname, lastname, id, sex, birthdate, hourlyRate);

        this.HoursWorkedPerWeek = HoursWorkedPerWeek;

    }

    public Partime() {
    }

    @Override

    public double monthlyEarning() {
        return hourlyRate * HoursWorkedPerWeek * 4;
    }

    public int getHoursWorkedPerWeek() {
        return HoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(int HoursWorkedPerWeek) {
        this.HoursWorkedPerWeek = HoursWorkedPerWeek;
    }

    public String toString() {
        return super.toString() + "\nHours worked per month : " + (HoursWorkedPerWeek * 4);
    }

}