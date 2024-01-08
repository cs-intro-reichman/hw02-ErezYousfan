/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int firstRand = (int) (Math.random() * 10);
		int secondRand = firstRand + 1; // TODO: maybe more natural would be to use do while instead of this trick
		while (firstRand < secondRand) {
			System.out.print(firstRand);
			secondRand = (int) (Math.random() * 10);
			if ( Math.max (firstRand, secondRand) != secondRand ){
				firstRand = secondRand;	// to get out of the while loop
			}
			else {
				firstRand = secondRand;
				secondRand = firstRand + 1;
			}
		}
	}
}
