/*
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there. 
 * front22("kitten") → "kikittenki"
 * front22("Ha") → "HaHaHa"
 * front22("abc") → "ababcab"
 */
public class Front22 {

	//Class for testing and setting dummy values
	public static void main( String [] args ) {	
		
		//Output tests
		System.out.println( front22( "Hel" ) );
	}
	
	public static String front22( String str ) {
		  int length = str.length();
		  if( length < 3 ) {
			  String firstsomething = str.substring( 0, length );
			  return firstsomething + str + firstsomething;
		  } else {
			  String firsttwo = str.substring( 0, 2 );
			  return firsttwo + str + firsttwo;
		  }
	}
}
