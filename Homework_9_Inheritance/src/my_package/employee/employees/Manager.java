package my_package.employee.employees;

import my_package.employee.Employee;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Manager " + this.getName() + " is currently busy verifying if all tasks are on track," +
                " addressing issues to ensure our new application will be delivered on time.");
    }

    @Override
    public void describeRole() {
        System.out.println("As a Manager, " + this.getName() + " is responsible for overseeing team performance, " +
                "coordinating projects, setting strategic goals, ensuring deadlines are met, " +
                "and managing resources within the department.");
    }


    @Override
    public void describeRole(String extraInfo) {
        describeRole();
        System.out.println("Here is extra info you should know about managers job: " +
                " " + extraInfo);
    }
}

