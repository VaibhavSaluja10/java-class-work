package wrapperclass;

public class BoxingEx1 {

    public static void main(String[] args) {

        // Boxing
        int a = 10;
        Integer i = new Integer(a);
        System.out.println(i);

        int b = 20;
        Integer i2 = Integer.valueOf(b);
        System.out.println(i2);

        // AutoBoxing
        int c = 30;
        Integer d = c;
        System.out.println(d);

        // Unboxing
        Integer m = new Integer(40);
        int n = m.intValue();
        System.out.println(n);

        byte x = 50;
        Byte y = Byte.valueOf(x);
        byte z = y.byteValue();
        System.out.println(z);

        int s = 77;
        Integer t = s; // AutoBoxing
        int u = t;    // AutoUnboxing
        System.out.println(u);

    }

}
