package intermediateStringProgram;

//File 1: IntermediateStringUtils.java

public class Intermediate {

 // 1. Find duplicate characters in a String
 public static void findDuplicateCharacters(String str) {
     int[] freq = new int[256];
     for (int i = 0; i < str.length(); i++) {
         freq[str.charAt(i)]++;
     }
     System.out.println("Duplicate characters:");
     for (int i = 0; i < 256; i++) {
         if (freq[i] > 1 && i != ' ') {
             System.out.println((char) i + " : " + freq[i]);
         }
     }
 }

 // 2. Count frequency of each character
 public static void countCharacterFrequency(String str) {
     int[] freq = new int[256];
     for (int i = 0; i < str.length(); i++) {
         freq[str.charAt(i)]++;
     }
     System.out.println("Character frequencies:");
     for (int i = 0; i < 256; i++) {
         if (freq[i] > 0 && i != ' ') {
             System.out.println((char) i + " : " + freq[i]);
         }
     }
 }

 // 3. Check if two Strings are anagrams
 public static boolean areAnagrams(String s1, String s2) {
     if (s1.length() != s2.length()) return false;

     int[] freq = new int[256];
     for (int i = 0; i < s1.length(); i++) {
         freq[s1.charAt(i)]++;
         freq[s2.charAt(i)]--;
     }
     for (int i = 0; i < 256; i++) {
         if (freq[i] != 0) return false;
     }
     return true;
 }

 // 4. Replace a character in a String
 public static String replaceCharacter(String str, char oldChar, char newChar) {
     String result = "";
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == oldChar)
             result += newChar;
         else
             result += str.charAt(i);
     }
     return result;
 }

 // 5. Remove duplicate characters
 public static String removeDuplicateCharacters(String str) {
     boolean[] seen = new boolean[256];
     String result = "";
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (!seen[ch]) {
             seen[ch] = true;
             result += ch;
         }
     }
     return result;
 }

 // 6. Find first non-repeating character
 public static char firstNonRepeatingChar(String str) {
     int[] freq = new int[256];
     for (int i = 0; i < str.length(); i++) {
         freq[str.charAt(i)]++;
     }
     for (int i = 0; i < str.length(); i++) {
         if (freq[str.charAt(i)] == 1)
             return str.charAt(i);
     }
     return '\0';
 }

 // 7. Reverse each word in a String
 public static String reverseEachWord(String str) {
     String result = "";
     String word = "";
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch != ' ') {
             word = ch + word;
         } else {
             result += word + " ";
             word = "";
         }
     }
     result += word;
     return result;
 }

 // 8. Capitalize first letter of each word
 public static String capitalizeWords(String str) {
     String result = "";
     boolean capitalize = true;
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch == ' ') {
             capitalize = true;
             result += ch;
         } else if (capitalize) {
             result += (char) (ch - 32);
             capitalize = false;
         } else {
             result += ch;
         }
     }
     return result;
 }

 // 9. Find longest word in a sentence
 public static String longestWord(String str) {
     String longest = "";
     String word = "";
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch != ' ') {
             word += ch;
         } else {
             if (word.length() > longest.length())
                 longest = word;
             word = "";
         }
     }
     if (word.length() > longest.length())
         longest = word;
     return longest;
 }

 // 10. Count occurrences of a substring
 public static int countSubstringOccurrences(String str, String sub) {
     int count = 0;
     for (int i = 0; i <= str.length() - sub.length(); i++) {
         int j;
         for (j = 0; j < sub.length(); j++) {
             if (str.charAt(i + j) != sub.charAt(j))
                 break;
         }
         if (j == sub.length())
             count++;
     }
     return count;
 }
}
