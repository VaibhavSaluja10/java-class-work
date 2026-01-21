//Write a Java program where:
//A Mobile has a SIM
//SIM contains network and number
//Mobile uses SIM details to make a call
//--> Show composition
//


package hasARelationship;

public class Mobile {
    private Sim sim;

    public Mobile(Sim sim) {
        this.sim = sim;
    }

    public void makeCall() {
        System.out.println("Making a call using SIM with number: " + sim.getNumber() + " on network: " + sim.getNetwork());
    }

}
