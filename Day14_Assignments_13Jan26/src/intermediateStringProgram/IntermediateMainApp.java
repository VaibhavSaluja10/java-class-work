package intermediateStringProgram;

public class IntermediateMainApp {
	 public static void main(String[] args) {

	     String str = "programming in java";

	     Intermediate.findDuplicateCharacters(str);
	     Intermediate.countCharacterFrequency(str);

	     System.out.println("Anagrams: " +
	    		 Intermediate.areAnagrams("listen", "silent"));

	     System.out.println("Replace char: " +
	    		 Intermediate.replaceCharacter(str, 'a', 'A'));

	     System.out.println("Remove duplicates: " +
	    		 Intermediate.removeDuplicateCharacters("banana"));

	     System.out.println("First non-repeating: " +
	    		 Intermediate.firstNonRepeatingChar("swiss"));

	     System.out.println("Reverse each word: " +
	    		 Intermediate.reverseEachWord(str));

	     System.out.println("Capitalize words: " +
	    		 Intermediate.capitalizeWords(str));

	     System.out.println("Longest word: " +
	    		 Intermediate.longestWord(str));

	     System.out.println("Substring occurrences: " +
	    		 Intermediate.countSubstringOccurrences("abababa", "aba"));
	 }
	}
