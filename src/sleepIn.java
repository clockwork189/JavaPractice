/* SleepIn
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 
 * sleepIn(false, false) → true
 * sleepIn(true, false) → false
 * sleepIn(false, true) → true
 */
public class sleepIn {
	
	//Class for testing and setting dummy values
	public static void main( String[] args ) {
		boolean weekday = true;
		boolean vacation = true;
		
		//Output tests
		System.out.println( cansleepIn(weekday, vacation) );
	}
	public static boolean cansleepIn(boolean weekday, boolean vacation) {
	    if( weekday != true || vacation == true ) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
