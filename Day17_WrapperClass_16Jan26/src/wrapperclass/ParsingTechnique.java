package wrapperclass;

public class ParsingTechnique {
    public static void main(String[] args) {

        String str1 = "100";

        int num1 = Integer.parseInt(str1);
        System.out.println("String to int: " + num1);

        String str2 = "45.67";
        double num2 = Double.parseDouble(str2);
        System.out.println("String to double: " + num2);

        String str = "102";
        double num = Double.parseDouble(str);
        System.out.println("String to double: " + num);

        int num3 = 200;
        String str3 = Integer.toString(num3);
        System.out.println("int to String: " + str3);

        double num4 = 89.01;
        String str4 = Double.toString(num4);
        System.out.println("double to String: " + str4);

        byte b = 25;
        String str5 = Byte.toString(b);
        System.out.println("byte to String: " + str5);

        String str6 = "25";
        byte b1 = Byte.parseByte(str6);
        System.out.println("String to byte: " + b1);

        String str7 = "25";
        short s1 = Short.parseShort(str7);
        System.out.println("String to short: " + s1);

    }

}
