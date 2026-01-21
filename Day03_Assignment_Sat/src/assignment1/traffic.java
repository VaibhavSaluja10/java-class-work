package assignment1;

public class traffic {
    public static void main(String[] args) {

        int fine = 0;
        int speed = 100;
        int veh = 90;
        boolean emer = false;

        boolean res = (veh > speed && !emer);
        fine += res ? 1000 : 0;

        System.out.println(res);
        System.out.println("Fine is: " + fine);
    }
}
