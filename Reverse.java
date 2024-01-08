/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String inS = args[0];
		int lengthS = inS.length(); // TODO: not very aestetic variable names
		for (int i = lengthS - 1; i >=0; i--) {
			System.out.print(inS.charAt(i));	// prints the given string in reverse
		}
		System.out.println();	// new line
		int middleIndex = (lengthS - 1) / 2; 
		char middleC = inS.charAt(middleIndex);
		System.out.println("The middle character is " + middleC);	// prints the char in the middle of the given string
	}
}
