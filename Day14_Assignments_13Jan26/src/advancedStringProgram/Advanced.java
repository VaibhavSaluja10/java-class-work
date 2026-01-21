package advancedStringProgram;


public class Advanced {

 // 1. Check if String contains only digits
 public static boolean containsOnlyDigits(String str) {
     if (str == null || str.isEmpty()) return false;
     for(int i=0;i<str.length();i++) {
    	 if(str.charAt(i) >= '0' || str.charAt(i) <= 9) {
    		 return false;
    	 }
     }
     return true;
 }

 // 2. Remove special characters (keep only letters and digits)
 public static String removeSpecialCharacters(String str) {
     String result = "";
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch<= '9')){
        	 result += ch;
         }
     }
     return result;
 }

 // 3. Check if String is rotation of another String
 public static boolean isRotation(String s1, String s2) {
     if (s1.length() != s2.length()) return false;
     String temp = s1 + s1;
     return temp.contains(s2);
 }

 // 4. Find all permutations of a String
 public static void permutations(String str, String result) {
     if (str.length() == 0) {
         System.out.println(result);
         return;
     }
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         String left = str.substring(0, i);
         String right = str.substring(i + 1);
         permutations(left + right, result + ch);
     }
 }

 // 5. Find longest palindrome substring
 public static String longestPalindrome(String str) {
     String longest = "";
     for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j <= str.length(); j++) {
             String sub = str.substring(i, j);
             if (isPalindrome(sub) && sub.length() > longest.length()) {
                 longest = sub;
             }
         }
     }
     return longest;
 }

 private static boolean isPalindrome(String str) {
     int start = 0, end = str.length() - 1;
     while (start < end) {
         if (str.charAt(start) != str.charAt(end))
             return false;
         start++;
         end--;
     }
     return true;
 }

 // 6. Compress a String (aabbb → a2b3)
 public static String compressString(String str) {
     String result = "";
     int count = 1;

     for (int i = 0; i < str.length(); i++) {
         if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
             count++;
         } else {
             result += str.charAt(i) + String.valueOf(count);
             count = 1;
         }
     }
     return result;
 }

 // 7. Find maximum occurring character
 public static char maxOccurringChar(String str) {
     int[] freq = new int[256];
     for (int i = 0; i < str.length(); i++) {
         freq[str.charAt(i)]++;
     }
     int max = 0;
     char result = ' ';
     for (int i = 0; i < str.length(); i++) {
         if (freq[str.charAt(i)] > max) {
             max = freq[str.charAt(i)];
             result = str.charAt(i);
         }
     }
     return result;
 }

 // 8. Convert String to Integer without parseInt()
 public static int stringToInt(String str) {
     int num = 0;
     for (int i = 0; i < str.length(); i++) {
         num = num * 10 + (str.charAt(i) - '0');
     }
     return num;
 }

 // 9. Split String without using split()
 public static void splitString(String str, char delimiter) {
     String word = "";
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) != delimiter) {
             word += str.charAt(i);
         } else {
             System.out.println(word);
             word = "";
         }
     }
     System.out.println(word);
 }

 // 10. Toggle case of each character
 public static String toggleCase(String str) {
     String result = "";
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch >= 'A' && ch <= 'Z')
             result += (char)(ch + 32);
         else if (ch >= 'a' && ch <= 'z')
             result += (char)(ch - 32);
         else
             result += ch;
     }
     return result;
 }
}

