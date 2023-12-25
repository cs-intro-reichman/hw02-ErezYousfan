
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		int num = (int) (Math.random() * 2);
		boolean boy = num == 0; 
		boolean girl = !boy;
		int kidsNum = 1;
		if (boy) {
			System.out.print("b");
		}
		else {
			System.out.print("g");
		}
		while (!boy || !girl) {
			num = (int) (Math.random() * 2);
			if (num == 0) {
				System.out.print(" b");
				boy = true;
			}
			else {
				System.out.print(" g");
				girl = true;
			}
			kidsNum++;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + kidsNum + " children");
	}
}
