/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]); // number of families given
		int twoKids = 0, threeKids = 0, fourOrMore = 0;
		int totalKids = 0;
		for (int i = 0; i < T; i++){
			int num = (int) (Math.random() * 2);
			boolean boy = num == 0;
			boolean girl = !boy;
			int kidsNum = 1;
			while (!boy || !girl) {
				num = (int) (Math.random() * 2);
				if (num == 0) {
					boy = true;
				}
				else {
					girl = true;
				}
				kidsNum++;
			}
			if(kidsNum == 2) twoKids++;
			else if (kidsNum == 3) threeKids++;
			else fourOrMore++;
			totalKids += kidsNum;
		}
		double avg = totalKids / ((double) T);
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoKids);
		System.out.println("Number of families with 3 children: " + threeKids);
		System.out.println("Number of families with 4 or more children: " + fourOrMore);
		int commonNumber = 0;
		if (twoKids >= threeKids && twoKids >= fourOrMore){
			commonNumber = 2;
		}
		else if(threeKids >= twoKids && threeKids >= fourOrMore) {
			commonNumber = 3;
		}
		else {
			commonNumber = 4;
		}
		System.out.println("The most common number of children is " + commonNumber + ".");
	}
}
