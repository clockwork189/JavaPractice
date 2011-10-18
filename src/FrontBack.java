/*
 * Given a string, return a new string where the first and last chars have been exchanged. 
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

public class FrontBack {

	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		//Output tests
		System.out.println( frontBack( "Hello World" ) );
	}
		
	public static String frontBack( String str ) {
		if( str.length() < 1 ) {
			return str;
		}
		else if( str.length() > 1 ) {
			char first = str.charAt( 0 );
			char last = str.charAt( str.length() - 1 );
			return last + str.substring( 1, str.length()-1 ) + first;
		} else {
			return str;
		}
	}
}

