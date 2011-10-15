/*
 * Given 2 int values, return true if one is negative and one is positive. Unless the parameter "negative" is true, then they both must be negative. 
 * posNeg(1, -1, false) → true
 * posNeg(-1, 1, false) → true
 * posNeg(1, 1, false) → false
 */
public class PosNeg {
	
	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		
		//Output tests
		System.out.println( posNeg( 1, 1, false ) );
	}
	
	public static boolean posNeg( int a, int b, boolean negative ) {
		if( negative ) {
			return ( a < 0 && b < 0 );
		} else {
			return ( ( a < 0 && b < 0 )? false : ( a > 0 && b > 0 )? false : true );
		}
	}
}
