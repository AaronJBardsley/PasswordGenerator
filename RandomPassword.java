/* Generates a pseudo-random password using letters, numbers, symbols, and length as specified. */

//TODO change symbols to reflect commonly accepted symbols

import java.util.concurrent.ThreadLocalRandom;

public class RandomPassword {

	int length = 0;
	boolean hasNumbers = false;
	boolean hasSymbols = false;

	public RandomPassword() {

	}

	public RandomPassword(int length, boolean hasNumbers, boolean hasSymbols) {
		this.length = length;
		this.hasNumbers = hasNumbers;
		this.hasSymbols = hasSymbols;
	}

	// for passwords with only letters (uppercase and lowercase)
	public char[] lettersPassword() {
		char[] chars = new char[length];

		if (!hasNumbers && !hasSymbols) {
			for (int i = 0; i < length; i++) {

				// pick each char type randomly
				int split = ThreadLocalRandom.current().nextInt(0, 1 + 1);
				
				if (split == 0) {
					// ASCII uppercase letters
					int rand = ThreadLocalRandom.current().nextInt(65, 90 + 1);
					char c = (char) rand;
					chars[i] = c;
				} else if (split == 1) {
					// ASCII lowercase letters
					int rand = ThreadLocalRandom.current().nextInt(97, 122 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
			}
		}
		return chars;
	}

	// for passwords with letters (uppercase and lowercase) and numbers
	public char[] alphanumericPassword() {
		char[] chars = new char[length];

		if (hasNumbers && !hasSymbols) {
			for (int i = 0; i < length; i++) {

				// pick each char type randomly
				int split = ThreadLocalRandom.current().nextInt(0, 2 + 1);
				
				if (split == 0) {
					// ASCII uppercase letters
					int rand = ThreadLocalRandom.current().nextInt(65, 90 + 1);
					char c = (char) rand;
					chars[i] = c;
				} else if (split == 1) {
					// ASCII lowercase letters
					int rand = ThreadLocalRandom.current().nextInt(97, 122 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
				else if (split == 2) {
					// ASCII numbers
					int rand = ThreadLocalRandom.current().nextInt(48, 57 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
			}
		}
		return chars;
	}

	// for passwords with letters (uppercase and lowercase) and symbols
	public char[] alphasymbolicPassword() {
		char[] chars = new char[length];

		if (!hasNumbers && hasSymbols) {
			for (int i = 0; i < length; i++) {

				// pick each char type randomly
				int split = ThreadLocalRandom.current().nextInt(0, 2 + 1);
				
				if (split == 0) {
					// ASCII uppercase letters
					int rand = ThreadLocalRandom.current().nextInt(65, 90 + 1);
					char c = (char) rand;
					chars[i] = c;
				} else if (split == 1) {
					// ASCII lowercase numbers
					int rand = ThreadLocalRandom.current().nextInt(97, 122 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
				else if (split == 2) {
					// ASCII symbols (NOT ALL SYMBOLS WORK IN ALL SITUATIONS)
					int rand = ThreadLocalRandom.current().nextInt(33, 47 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
			}
		}
		return chars;
	}

	// for passwords with letter (uppercase and lowercase) and numbers and symbols
	public char[] alphanumericsymbolicPassword() {
		char[] chars = new char[length];

		if (hasNumbers && hasSymbols) {
			for (int i = 0; i < length; i++) {

				// pick each char type randomly
				int split = ThreadLocalRandom.current().nextInt(0, 3 + 1);
				
				if (split == 0) {
					// ASCII uppercase letters
					int rand = ThreadLocalRandom.current().nextInt(65, 90 + 1);
					char c = (char) rand;
					chars[i] = c;
				} else if (split == 1) {
					// ASCII lowercase letters
					int rand = ThreadLocalRandom.current().nextInt(97, 122 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
				else if (split == 2) {
					// ASCII symbols (NOT ALL SYMBOLS WORK IN ALL SITUATIONS)
					int rand = ThreadLocalRandom.current().nextInt(33, 47 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
				else if (split == 3) {
					// ASCII numbers
					int rand = ThreadLocalRandom.current().nextInt(48, 57 + 1);
					char c = (char) rand;
					chars[i] = c;
				}
			}
		}
		return chars;
	}
	
}