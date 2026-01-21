package assignment1;

public class store {
    public static void main(String[] args) {

        int pur = 2001;
        boolean premium = false;
        boolean first = true;

        boolean res = (pur > 2000 && (premium || first));
        pur -= res ? 100 : 0;

        System.out.println(res);
        System.out.println("Final Bill: " + pur);
    }
}
