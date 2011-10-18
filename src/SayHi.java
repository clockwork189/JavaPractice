/* Given a string, return true if the string starts with "hi" and false otherwise. 
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
*/
public class SayHi {

	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		//Output tests
		System.out.println( startHi( "hi there" ) );
	}
	
	public static boolean startHi( String str ) {
		if( str.length() < 2 ) {
			return false;
		}
		String isHi = str.substring( 0, 2 );
		if( isHi.toLowerCase().equals( "hi" ) ) {
			return true;
		} else {
			return false;
		}
	}

}
