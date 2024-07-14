package my_package.employee;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee " + this.name + " is working again.");
    }

    public void takeBreak() {
        System.out.println("Employee " + this.name + " is having a break.");

    }

    public void performJob() {
        System.out.println("Employee " + this.name + " is performing a very important job.");
    }

    public void describeRole() {
        System.out.println("Employee " + this.name + " works in the ABC company.");

    }

    public void describeRole(String extraInfo) {
        describeRole();
        System.out.println(extraInfo);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
