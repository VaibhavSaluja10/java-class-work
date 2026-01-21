package stringBuilderOrStringBuffer;

public class StringBufferBuilderMainApp {
	 public static void main(String[] args) {

	     // 1. Reverse using StringBuffer
	     System.out.println("Reversed: " +
	             StringBufferBuilderUtils.reverseUsingStringBuffer("Hello"));

	     // 2. Append multiple strings
	     String[] words = {"Java", " ", "is", " ", "fast"};
	     System.out.println("Appended String: " +
	             StringBufferBuilderUtils.appendStrings(words));

	     // 3. Performance comparison
	     StringBufferBuilderUtils.comparePerformance();

	     // 4. Insert and delete
	     StringBufferBuilderUtils.insertAndDelete();

	     // 5. Mutability demonstration
	     StringBufferBuilderUtils.demonstrateMutability();
	 }
	}


