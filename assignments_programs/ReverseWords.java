package assignments_programs;

public class ReverseWords {
	public static void main(String[] args) {
		String input = "Java Concept Of The Day";
		String[] words = input.split(" ");

		StringBuilder reversedString = new StringBuilder();
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word);
			reversedWord.reverse();
			reversedString.append(reversedWord).append(" ");
		}

		System.out.println(input+"\n"+reversedString.toString().trim());
	}
}
