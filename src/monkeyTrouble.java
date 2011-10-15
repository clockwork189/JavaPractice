/* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 * monkeyTrouble(true, true) → true
 * monkeyTrouble(false, false) → true
 * monkeyTrouble(true, false) → false
*/
public class monkeyTrouble {
	
	//Class for testing and setting dummy values
	public static void main( String [] args ) {
		boolean aSmile = true;
		boolean bSmile = true;
		
		//Output tests
		System.out.print( monkeyTrouble( aSmile, bSmile ) );
	}
	
	public static boolean monkeyTrouble( boolean aSmile, boolean bSmile ) {
		  if( ( aSmile && bSmile ) || ( !aSmile && !bSmile ) ) {
			  return true;
		  } else {
			  return false;
		  }
	}
}
