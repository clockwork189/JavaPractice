/*Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more. 
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
*/

public class BackAround {

	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		
		//Output tests
		System.out.println( backAround( "Hello" ) );
	}
	
	public static String backAround( String str ) {
		  int length = str.length();
		  char lastLetter = str.charAt( length - 1 );
		  return lastLetter + str + lastLetter;
	}
}
