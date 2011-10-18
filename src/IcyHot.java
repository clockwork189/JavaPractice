/*
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100. 
 * icyHot(120, -1) → true
 * icyHot(-1, 120) → true
 * icyHot(2, 120) → false
 */
public class IcyHot {

	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		//Output tests
		System.out.println( icyHot( 120, -10 ) );
	}
	
	public static boolean icyHot( int temp1, int temp2 ) {
		  if( ( ( temp1 < 0 ) && ( temp2 > 100 ) ) || ( ( temp1 > 100 ) && ( temp2 < 0 ) ) ) {
			  return true;
		  } else {
			  return false;
		  }
	}
}
