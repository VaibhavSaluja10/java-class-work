package scenarioBasedProgram;

public class ScenarioMain {
	 public static void main(String[] args) {

	     // 1. Password validation
	     System.out.println("Password valid: " +
	             ScenarioStringUtils.validatePassword("Abc12345"));

	     // 2. Email validation
	     System.out.println("Email valid: " +
	             ScenarioStringUtils.validateEmail("test@gmail.com"));

	     // 3. Count words starting with vowel
	     String sentence = "An apple is on a umbrella";
	     System.out.println("Words starting with vowel: " +
	             ScenarioStringUtils.countWordsStartingWithVowel(sentence));

	     // 4. Repeated words
	     String paragraph = "Java is easy and Java is powerful";
	     ScenarioStringUtils.findRepeatedWords(paragraph);

	     // 5. Remove extra spaces
	     String spaced = "Java    is   very   powerful";
	     System.out.println("After removing extra spaces: " +
	             ScenarioStringUtils.removeExtraSpaces(spaced));
	 }
	}
