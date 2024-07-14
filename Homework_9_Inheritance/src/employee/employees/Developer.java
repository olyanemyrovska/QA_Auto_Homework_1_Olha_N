package employee.employees;

import employee.Employee;

public class Developer extends Employee {

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Developer " + this.getName() + " is currently writing code and debugging issues in order to build " +
                "our new software application.");
    }

    @Override
    public void describeRole() {
        System.out.println("As a Developer, " + this.getName() + " is responsible for designing, implementing" +
                " and maintaining software applications within the ABC company.");
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Here is extra info you should know about a developer's job: " + extraInfo);
    }
}
