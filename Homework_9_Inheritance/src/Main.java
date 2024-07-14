import employee.Employee;
import employee.employees.Designer;
import employee.employees.Developer;
import employee.employees.Manager;

public class Main {
    public static void main(String[] args) {
        Manager alex = new Manager("Alex D.", 30, 4000);
        Developer max = new Developer("Max P.", 33, 5000);
        Designer anna = new Designer("Anna K.", 25, 3500);

        Employee[] employees = new Employee[]{alex, max, anna};

        for (Employee employee : employees) {
            employee.describeRole();
            employee.performJob();
            System.out.println("**************************************************************************");
        }
    }
}