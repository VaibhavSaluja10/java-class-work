package basicStringProgram;

public class BasicMain {
    public static void main(String[] args) {

        String str = "Hello World";

        // 1. Print String
        Basic.printString(str);

        // 2. Length of String
        System.out.println("Length: " + Basic.findLength(str));

        // 3. Reverse String
        System.out.println("Reversed: " + Basic.reverseString(str));

        // 4. Palindrome Check
        System.out.println("Is Palindrome: " + Basic.isPalindrome("madam"));

        // 5. Count vowels and consonants
        Basic.countVowelsAndConsonants(str);

        // 6. Count characters
        System.out.println("Characters (excluding spaces): " + Basic.countCharacters(str));

        // 7. Count words
        System.out.println("Words: " + Basic.countWords(str));

        // 8. Convert case
        Basic.convertCase(str);

        // 9. Compare strings
        String s1 = new String("Java");
        String s2 = "Java";
        Basic.compareStrings(s1, s2);

        // 10. Remove spaces
        System.out.println("Without spaces: " + Basic.removeSpaces(str));
    }
}
