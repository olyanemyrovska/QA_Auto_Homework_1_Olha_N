import my_package.employee.Employee;
import my_package.employee.employees.Designer;
import my_package.employee.employees.Developer;
import my_package.employee.employees.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Erlich Bachman", 30, 4000);
        Designer designer = new Designer("Monica Hall", 25, 3500);
        Developer middleDev = new Developer("Dinesh Chugtai ", 27, 2500);
        Developer juniorDev = new Developer("Nelson Bighetti ", 22, 1000);
        Developer seniorDev = new Developer("Richard Hendricks", 33, 5000, true);

        Employee[] employees = new Employee[]{manager, designer, juniorDev, middleDev, seniorDev,};

        for (Employee employee : employees) {
            employee.describeRole();
            employee.performJob();
            employee.takeBreak();
            employee.work();
            System.out.println("**************************************************************************");
        }
    }
}