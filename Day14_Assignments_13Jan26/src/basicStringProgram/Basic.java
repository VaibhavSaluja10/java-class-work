package basicStringProgram;

public class Basic {

 // 1. Print a String
 public static void printString(String str) {
     System.out.println("String: " + str);
 }

 // 2. Find length of a String (without using length())
 public static int findLength(String str) {
	 char[] arr = str.toCharArray();
     int count = 0;
     for (char c : arr) {
         count++;
     }
     return count;
 }

 // 3. Reverse a String
 public static String reverseString(String str) {
     String reversed = "";
     for (int i = str.length() - 1; i >= 0; i--) {
         reversed += str.charAt(i);
     }
     return reversed;
 }

 // 4. Check if String is Palindrome
 public static boolean isPalindrome(String str) {
     String rev = reverseString(str);
     return str.equals(rev);
 }

 // 5. Count vowels and consonants
 public static void countVowelsAndConsonants(String str) {
     int vowels = 0, consonants = 0;
     str = str.toLowerCase();

     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch >= 'a' && ch <= 'z') {
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                 vowels++;
             else
                 consonants++;
         }
     }
     System.out.println("Vowels: " + vowels);
     System.out.println("Consonants: " + consonants);
 }

 // 6. Count number of characters (excluding spaces)
 public static int countCharacters(String str) {
     int count = 0;
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) != ' ')
             count++;
     }
     return count;
 }

 // 7. Count number of words
 public static int countWords(String str) {
     if (str == null || str.trim().isEmpty())
         return 0;

     String[] words = str.trim().split("\\s+");
     return words.length;
 }

 // 8. Convert String to uppercase & lowercase
 public static void convertCase(String str) {
     System.out.println("Uppercase: " + str.toUpperCase());
     System.out.println("Lowercase: " + str.toLowerCase());
 }

 // 9. Compare two Strings (equals vs ==)
 public static void compareStrings(String s1, String s2) {
     System.out.println("Using equals(): " + s1.equals(s2));
     System.out.println("Using == : " + (s1 == s2));
 }

 // 10. Remove spaces from a String
 public static String removeSpaces(String str) {
     return str.replace(" ", "");
 }
}


