/*diff21
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 */

public class diff21 {
	
	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		int n = 23;
		
		//Output tests
		System.out.println( diff21( n ) );
	}
	
	public static int diff21( int n ) {
		int difference = 21 - n;
		int result = ( difference < 0 ) ? ( 2*Math.abs( difference ) ) : Math.abs( difference );
		return result;
	}
}

