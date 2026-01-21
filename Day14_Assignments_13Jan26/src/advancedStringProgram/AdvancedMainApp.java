package advancedStringProgram;

public class AdvancedMainApp {
	 public static void main(String[] args) {

	     String str = "aabbbcc123";

	     System.out.println("Only digits: " + Advanced.containsOnlyDigits("12345"));
	     System.out.println("No special chars: " + Advanced.removeSpecialCharacters("a@b#1$2"));
	     System.out.println("Is rotation: " + Advanced.isRotation("ABCD", "CDAB"));

	     System.out.println("Permutations of ABC:");
	     Advanced.permutations("ABC", "");

	     System.out.println("Longest Palindrome: " + Advanced.longestPalindrome("babad"));
	     System.out.println("Compressed: " + Advanced.compressString("aabbb"));
	     System.out.println("Max occurring char: " + Advanced.maxOccurringChar("success"));
	     System.out.println("String to Int: " + Advanced.stringToInt("1234"));

	     System.out.println("Split String:");
	     Advanced.splitString("Java,is,fun", ',');

	     System.out.println("Toggle Case: " + Advanced.toggleCase("JaVa"));
	 }
	}

