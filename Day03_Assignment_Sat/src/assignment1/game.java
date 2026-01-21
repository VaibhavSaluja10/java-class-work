package assignment1;

public class game {
    public static void main(String[] args) {

        int score = 120;
        int timeTaken = 85;
        int timeLimit = 100;
        boolean cheats = false;

        boolean bonus = (score > 100 && timeTaken <= timeLimit && !cheats);

        score += bonus ? 50 : 0;

        System.out.println("Bonus Eligible: " + bonus);
        System.out.println("Updated Score: " + score);
    }
}
