/*
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings. 
 * notString("candy") → "not candy"
 * notString("x") → "not x"
 * notString("not bad") → "not bad"
 */
public class NotString {
	
	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
	
		//Output tests
		System.out.println( notString( "not yet" ) );
	}
	
	public static String notString( String str ) {
		String lowercase = str.toLowerCase();
		if( lowercase.length() >= 3 && lowercase.substring( 0, 3 ).equals( "not" ) ) {
			return str;
		} else {
			String newString = "not " + str;
			return newString;
		}
	}
}
