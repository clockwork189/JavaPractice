
public class FrontBack {

	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		//Output tests
		System.out.println( frontBack( "Hello World" ) );
	}
		
	public static String frontBack( String str ) {
		char first = str.charAt( 0 );
		char last = str.charAt( str.length() - 1 );
		System.out.println( first + "  " + last );
		String newstring = str.replace(str.charAt( 0 ), last );
	//	newstring = newStrong.replace( str.charAt( str.length() -1 ), first );
		return newstring;
	}
}

