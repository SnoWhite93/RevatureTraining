package day3_assignments;

public class ConvertEachWordLastCharToUppercase {

	public static void main(String[] args) {

		String myString = "christmas lights are nice";
		StringBuilder sb = new StringBuilder();
		String[] newArr = myString.split(" ");
		String word = null;
		for (int i = 0; i < newArr.length; i++) {
			word = newArr[i];

			char lastCharOfWord = word.charAt(word.length() - 1);
			char uppercaseLastCharOfWord = Character.toUpperCase(lastCharOfWord);
			String wordWithoutLastChar = word.substring(0, word.length() - 1);

			sb.append(wordWithoutLastChar).append(uppercaseLastCharOfWord).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
