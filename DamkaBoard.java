/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int boardLength = Integer.parseInt(args[0]);
		int i = 0;
		int j;
		while (i < boardLength) {
			if ((i + 1) % 2 == 0) {
				System.out.print(" *");
			}
			else {
				System.out.print("*");
			}
			j = 1;
			while (j < boardLength) {
				System.out.print(" *");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
