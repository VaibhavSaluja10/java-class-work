package assignment1;

public class bank {
    public static void main(String[] args) {

        int bal = 200;
        boolean active = true;
        int with = 100;

        boolean res = (bal > with && active) ? true:false;
        bal -= res ? with : 0;

        System.out.println(res);
        System.out.println("Updated Balance: " + bal);
    }
}
