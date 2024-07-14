package my_package.employee.employees;

import my_package.employee.Employee;

public class Designer extends Employee {

    public Designer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Designer " + this.getName() + " currently creates visual designs for our new software application.");
    }

    @Override
    public void describeRole() {
        System.out.println("As a designer "+ this.getName() + " designs user interfaces and collaborates with developers to create appealing visual elements for projects.");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Additional info about " + this.getName() + " Designer role: " + extraInfo);
    }
}
