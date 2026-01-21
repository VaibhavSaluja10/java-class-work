package operators;

class Dividebyfive {
    public static void main(String[] args) {
        int number = 25; 
        String result = (number % 5 == 0) ? "is divisible by 5" : "is not divisible by 5";
        System.out.println("The number " + number + " " + result);
    }
}

