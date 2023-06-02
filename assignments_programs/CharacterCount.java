package assignments_programs;

public class CharacterCount {
	public static void main(String[] args) {
		String input = "Java J2EE Java JSP J2EE";
		int[] characterCount = new int[200];

		for (int i = 0; i < input.length(); i++) {
			char currentCharacter = input.charAt(i);
			characterCount[(int) currentCharacter]++;
		}

		for (int i = 0; i < characterCount.length; i++) {
			if (characterCount[i] > 0) {
				System.out.println((char)i+" = " +characterCount[i]);
			}
		}
	}
}
