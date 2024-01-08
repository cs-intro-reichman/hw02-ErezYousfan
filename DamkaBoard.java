/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int boardLength = Integer.parseInt(args[0]);
		for (int i = 0; i < boardLength; i += 2) { // TODO: row and col would be better naming than i and j
			for (int j = 0; (j < boardLength); j++) { // TODO: don't need parentheses in j < boardLength
				System.out.print("* ");
			}
			System.out.println();
			// TODO: not very clear comment. Try to explain better
			if((i + 1) != boardLength) { //so that it would work with odd numbers 
				for (int j = 0; (j < boardLength); j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
}
