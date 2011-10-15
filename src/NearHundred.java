/* Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 
 * nearHundred(93) → true
 * nearHundred(90) → true
 * nearHundred(89) → false
*/
public class NearHundred {
	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		int n = 23;
		
		//Output tests
		System.out.println( nearHundred( n ) );
	}
	
	public static boolean nearHundred( int n ) {
		if( Math.abs( n - 100 ) <= 10 || Math.abs( n - 200 ) <= 10 ) {
			return true;
		} else {
			return false;
		}
	}
}
