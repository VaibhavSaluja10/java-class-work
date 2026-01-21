
/*
1. Employee Salary System

Create a Java application for an organization where different employees have different salary calculations.
Define a base class Employee with a method calculateSalary().
Create subclasses like Developer, Manager, and Intern that override the method.
Use runtime polymorphism to calculate salaries without knowing the employee type in advance.


*/

package polymorphism;

public class MainAppEmployee1 {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Manager();
        Employee e3 = new Intern();

        System.out.println("Developer Salary: " + e1.calculateSalary());
        System.out.println("Manager Salary: " + e2.calculateSalary());
        System.out.println("Intern Salary: " + e3.calculateSalary());
    }
}
