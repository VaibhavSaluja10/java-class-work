package polymorphism;

class MenuItem {
    public double calculatePrice(int quantity) {
        return 0;
    }
}

class VegItem extends MenuItem {
    public double calculatePrice(int quantity) {
        return quantity * 150;
    }
}

class NonVegItem extends MenuItem {
    public double calculatePrice(int quantity) {
        return quantity * 250;
    }
}
