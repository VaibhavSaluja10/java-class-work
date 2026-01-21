package codingSimple;

public class ReverseNumNegative {
    public static void main(String[] args) {
        int n = -120;
        int rev = 0;

        int temp = n;
        if (temp < 0) temp = -temp;   // make positive

        while (temp > 0) {
            int last = temp % 10;
            rev = rev * 10 + last;
            temp = temp / 10;
        }

        if (n < 0) rev = -rev;        // restore sign
        System.out.println(rev);      // -21
    }
}
