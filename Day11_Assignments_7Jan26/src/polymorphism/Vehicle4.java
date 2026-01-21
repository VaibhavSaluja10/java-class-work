package polymorphism;

class Vehicle {
    public double calculateRent(int days) {
        return 0;
    }
}

class Car extends Vehicle {
    public double calculateRent(int days) {
        return days * 1500;
    }
}

class Bike extends Vehicle {
    public double calculateRent(int days) {
        return days * 500;
    }
}

class Truck extends Vehicle {
    public double calculateRent(int days) {
        return days * 3000;
    }
}
