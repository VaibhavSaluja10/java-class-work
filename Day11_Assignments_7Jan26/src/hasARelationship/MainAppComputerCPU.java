package hasARelationship;

public class MainAppComputerCPU {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel", 3.5);
        Computer computer = new Computer(cpu);
        computer.showSpecifications();
    }

}
