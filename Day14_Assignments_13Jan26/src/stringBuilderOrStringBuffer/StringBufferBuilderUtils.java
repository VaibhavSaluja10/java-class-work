package stringBuilderOrStringBuffer;


public class StringBufferBuilderUtils {

 // 1. Reverse String using StringBuffer
 public static String reverseUsingStringBuffer(String str) {
     StringBuffer sb = new StringBuffer(str);
     return sb.reverse().toString();
 }

 // 2. Append multiple Strings efficiently using StringBuilder
 public static String appendStrings(String[] arr) {
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < arr.length; i++) {
         sb.append(arr[i]);
     }
     return sb.toString();
 }

 // 3. Compare performance of String vs StringBuilder
 public static void comparePerformance() {
     int n = 10000;

     long start = System.currentTimeMillis();
     String str = "";
     for (int i = 0; i < n; i++) {
         str = str + i;
     }
     long end = System.currentTimeMillis();
     System.out.println("Time taken by String: " + (end - start) + " ms");

     start = System.currentTimeMillis();
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < n; i++) {
         sb.append(i);
     }
     end = System.currentTimeMillis();
     System.out.println("Time taken by StringBuilder: " + (end - start) + " ms");
 }

 // 4. Insert and delete characters using StringBuilder
 public static void insertAndDelete() {
     StringBuilder sb = new StringBuilder("JavaWorld");
     sb.insert(4, " ");   // Insert space
     System.out.println("After insert: " + sb);

     sb.delete(4, 5);      // Delete space
     System.out.println("After delete: " + sb);
 }

 // 5. Demonstrate mutability of String vs StringBuilder
 public static void demonstrateMutability() {
     String str = "Hello";
     str.concat(" World");
     System.out.println("String (immutable): " + str);

     StringBuilder sb = new StringBuilder("Hello");
     sb.append(" World");
     System.out.println("StringBuilder (mutable): " + sb);
 }
}

