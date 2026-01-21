package hasARelationship;

public class MainAppMobileSim {
    public static void main(String[] args) {
        Sim sim = new Sim("Verizon", "123-456-7890");
        Mobile mobile = new Mobile(sim);
        mobile.makeCall();
    }

}
