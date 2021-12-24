import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee {

    String firstname, lastname, id;
    char sex;
    Date birthdate;

    Employee() {

    }

    Employee(String firstname, String lastname, String id, char sex, Date birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.sex = sex;
        this.birthdate = birthdate;
    }

    public String toString() {
        SimpleDateFormat dateformat = new SimpleDateFormat("mm/dd/yy");
        String str = "ID : " + id + "\nEmployee Name : "
                + firstname + " " + lastname + "\nSex : " + sex + "\nBirth Date : "
                + dateformat.format(birthdate);
        return str;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;

    }

    public String getLastname() {

        return lastname;

    }

    public void setLastname(String lastname) {

        this.lastname = lastname;

    }

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public char getSex() {

        return sex;

    }

    public void setSex(char sex) {

        this.sex = sex;

    }

    public Date getbirthdate() {

        return birthdate;

    }

    public void setbirthdate(Date birthdate) {

        this.birthdate = birthdate;

    }

    public abstract double monthlyEarning();

}