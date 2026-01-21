//
//Write a Java program where:
//A Computer has a CPU
//CPU has brand and speed
//Display computer specifications



package hasARelationship;

public class Computer {
    private CPU cpu;

    public Computer(CPU cpu) {
        this.cpu = cpu;
    }

    public void showSpecifications() {
        System.out.println("CPU Brand: " + cpu.getBrand());
        System.out.println("CPU Speed: " + cpu.getSpeed() + " GHz");
    }

}
