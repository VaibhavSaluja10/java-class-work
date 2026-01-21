package polymorphism;

class Employee {
    public double calculateSalary() {
        return 0;
    }
}

class Developer extends Employee {
    public double calculateSalary() {
        return 50000;
    }
}

class Manager extends Employee {
    public double calculateSalary() {
        return 80000;
    }
}

class Intern extends Employee {
    public double calculateSalary() {
        return 15000;
    }
}