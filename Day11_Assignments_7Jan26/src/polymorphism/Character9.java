package polymorphism;

class Character {
    public void attack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends Character {
    public void attack() {
        System.out.println("Warrior attacks with sword");
    }
}

class Archer extends Character {
    public void attack() {
        System.out.println("Archer attacks with bow");
    }
}

class Mage extends Character {
    public void attack() {
        System.out.println("Mage attacks with magic");
    }
}
