package assignment1;

public class employee {
    public static void main(String[] args) {

        int perf = 6;
        int exp = 8;
        int sal = 50000;
        boolean action = false;

        boolean res = (perf > 3 || (exp > 5 && !action));
        sal += res ? 10000 : 0;

        System.out.println(res);
        System.out.println("Updated Salary: " + sal);
    }
}
