package assignment1;

public class exam {
    public static void main(String[] args) {

        int time = 90;
        boolean damage = false;
        int att = 45;
        boolean approve = true;

        boolean res = (damage || (att <= 60 && approve));
        time += res ? 40 : 0;

        System.out.println(res);
        System.out.println("Total Time for you is: " + time + " minutes");
    }
}
