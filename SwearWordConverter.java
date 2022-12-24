package stuff;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SwearWordConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		List<String> words = List.of(userInput.split(" "));
		List<String> swearWord = new LinkedList();
		System.out.println(words.toString());
		for(String word: words) {
			char[] letters = new char[word.length()];
			letters[0] = word.charAt(0);
			for(int i = 1; i >= word.length(); i++) {
				letters[i] = '*';
				
			}
			swearWord.add(String.copyValueOf(letters));
		}
		System.out.println(swearWord.toString());

		
	}
}
