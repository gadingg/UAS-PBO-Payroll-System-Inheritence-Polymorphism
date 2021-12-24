import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Tester {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy");
        Employee[] employee = new Employee[9];
        try {
            employee[0] = new Staff("Paita", "Allen", "123", 'M', sdf.parse("2/23/59"), 50.00);

            employee[1] = new Staff("Steven", "Zapata", "456", 'F', sdf.parse("7/12/64"), 35.00);

            employee[2] = new Staff("Enrique", "Rios", "789", 'M', sdf.parse("6/2/70"), 40.00);

            employee[3] = new Faculty("Anne", "Johnson", "243", 'F', sdf.parse("4/27/62"), Faculty.Level.FU,
                    new Education("Ph.D", "Engineering", 3));

            employee[4] = new Faculty("William", "Bouris", "791", 'F', sdf.parse("3/14/75"), Faculty.Level.AO,
                    new Education("Ph.D", "English", 1));

            employee[5] = new Faculty("Christopher", "Andrade", "623", 'F', sdf.parse("5/22/80"), Faculty.Level.AS,
                    new Education("MS", "Physical Education", 0));

            employee[6] = new Partime("Augusto", "Guzman", "455", 'F', sdf.parse("8/10/77"), 35.00, 30);

            employee[7] = new Partime("Martin", "Depirro", "678", 'F', sdf.parse("9/15/87"), 30.00, 15);

            employee[8] = new Partime("Marque", "Aldaco", "945", 'M', sdf.parse("11/24/88"), 20.00, 35);

            System.out.println("=== UAS Pemrograman Berorientasi Objek - Praktek ===\n");
            System.out.println(
                    "Anggota Kelompok :\n 1. R. Gading Utama Arsendy Putra [20051214050]\n 2. Krisna Gilang Prakoso [20051214046]\n 3. Rendy Pratama Putra [20051214088]\n 4. Reynisa Beta Nurlyan [20051214044]\n \n ================================================\n");
            System.out.println("=== All Employees ===\n");

            Collections.sort(Arrays.asList(employee), new Comparator<Employee>() {
                public int compare(Employee o1, Employee o2) {
                    return o1.getId().compareToIgnoreCase(o2.getId());
                }

            });

            for (Employee emp : employee) {
                System.out.println(emp.toString());
                System.out.println("");
            }

            System.out.println("=== All Staff Employees ===\n");

            for (Employee emp : employee) {
                if (emp.getClass() == Staff.class) {
                    System.out.println(emp.toString());
                    System.out.println("--");
                }

            }

            System.out.println();
            System.out.println("=== Faculty Employees ===\n");
            for (Employee emp : employee) {
                if (emp.getClass() == Faculty.class) {
                    System.out.println(emp.toString());
                    System.out.println("--");
                }
            }

            System.out.println();

            System.out.println("=== Part-time Employees ===\n");
            for (Employee emp : employee) {

                if (emp.getClass() == Partime.class) {
                    System.out.println(emp.toString());
                    System.out.println("--");
                }
            }

            float total_salary_all_employees = 0;
            float total_salary_partime_employees = 0;

            for (Employee emp : employee) {
                if (emp.getClass() == Partime.class) {
                    total_salary_partime_employees += emp.monthlyEarning();
                }
                total_salary_all_employees += emp.monthlyEarning();
            }

            System.out.println("\nTotal monthly salary of all part time employees: " + total_salary_partime_employees);
            System.out.println("Total monthly salary of all employees: " + total_salary_all_employees);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}