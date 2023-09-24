package wrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Character ch = new Character('a');
		Character ch2 = new Character('x');
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character: ");
		ch2 = (char)br.read();
		System.out.println("ch2 = " + ch2);
		System.out.println("Alphabet: " + Character.isAlphabetic(ch2));
		System.out.println("Uppercase: " + Character.isUpperCase(ch2));
		System.out.println("Lowercase; " + Character.isLowerCase(ch2));
		System.out.println("Digit: " + Character.isDigit(ch2));
		System.out.println("Letter or Digit: " + Character.isLetterOrDigit(ch2));
		System.out.println("Space: " + Character.isSpaceChar(ch2));
		System.out.println("White Space: " + Character.isWhitespace(ch2));
	}

}
