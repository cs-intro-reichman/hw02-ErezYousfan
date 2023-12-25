/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		String outS = num + " is a perfect number since " + num + " = 1";
		int i = 2;
		int sum = 1;
		while ((num % i == 0) && (i != num)) {
			outS += " + " + i;
			sum += i;
			i++;
		}
		if (sum == num) {
			System.out.println(outS);
		}
		else {
			System.out.println(num + " is not a perfect number"); 
		}
	}
}
