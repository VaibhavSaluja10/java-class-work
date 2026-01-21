package scenarioBasedProgram;

public class ScenarioStringUtils {

 // 1. Password validation
 // Rules: min 8 chars, at least 1 uppercase, 1 lowercase, 1 digit
 public static boolean validatePassword(String password) {
     if (password.length() < 8) return false;

     boolean hasUpper = false, hasLower = false, hasDigit = false;

     for (int i = 0; i < password.length(); i++) {
         char ch = password.charAt(i);
         if (ch >= 'A' && ch <= 'Z') hasUpper = true;
         else if (ch >= 'a' && ch <= 'z') hasLower = true;
         else if (ch >= '0' && ch <= '9') hasDigit = true;
     }
     return hasUpper && hasLower && hasDigit;
 }

 // 2. Email ID validation (basic)
 public static boolean validateEmail(String email) {
     int atPos = email.indexOf('@');
     int dotPos = email.lastIndexOf('.');

     if (atPos > 0 && dotPos > atPos + 1 && dotPos < email.length() - 1)
         return true;
     return false;
 }

 // 3. Count words starting with vowel
 public static int countWordsStartingWithVowel(String str) {
     int count = 0;
     String word = "";
     str = str.toLowerCase();

     for (int i = 0; i <= str.length(); i++) {
         if (i < str.length() && str.charAt(i) != ' ') {
             word += str.charAt(i);
         } else {
             if (!word.isEmpty()) {
                 char ch = word.charAt(0);
                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                     count++;
             }
             word = "";
         }
     }
     return count;
 }

 // 4. Find repeated words in a paragraph
 public static void findRepeatedWords(String str) {
     str = str.toLowerCase();
     String[] words = str.split("\\s+");
     boolean[] visited = new boolean[words.length];

     System.out.println("Repeated words:");
     for (int i = 0; i < words.length; i++) {
         if (visited[i]) continue;
         int count = 1;
         for (int j = i + 1; j < words.length; j++) {
             if (words[i].equals(words[j])) {
                 visited[j] = true;
                 count++;
             }
         }
         if (count > 1)
             System.out.println(words[i] + " : " + count);
     }
 }

 // 5. Remove extra spaces from a sentence
 public static String removeExtraSpaces(String str) {
     String result = "";
     boolean space = false;

     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch != ' ') {
             result += ch;
             space = false;
         } else if (!space) {
             result += ch;
             space = true;
         }
     }
     return result.trim();
 }
}


