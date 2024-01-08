/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here // TODO: remove the code you don't use
		int num = Integer.parseInt(args[0]);
		for (int i = 1; i <= num; i++){ // TODO: maybe call it divisor instead of i...or d at least
			if ((num % i) == 0) {
				System.out.println(i);
			}
		}
	}
}
