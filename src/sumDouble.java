/*sumDouble
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum. 
 * sumDouble(1, 2) → 3
 * sumDouble(3, 2) → 5
 * sumDouble(2, 2) → 8
 */
public class sumDouble {
	
	//Class for testing and setting dummy values
	public static void main(String [] args ) {	
		int a = 2;
		int b= 2;
		
		//Output tests
		System.out.println( sumDouble(a, b) );
	}
	public static int sumDouble(int a, int b) {
		int result = (a == b) ? (2*(a+b)) : (a + b);
		return result;
	}
}

