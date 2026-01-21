package polymorphism;

class Customer {
    public double calculateDiscount(double amount) {
        return 0;
    }
}

class RegularCustomer extends Customer {
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}

class PremiumCustomer extends Customer {
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}

class VIPCustomer extends Customer {
    public double calculateDiscount(double amount) {
        return amount * 0.20;
    }
}
