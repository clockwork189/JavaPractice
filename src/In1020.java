/*
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
 * in1020(12, 99) → true
 * in1020(21, 12) → true
 * in1020(8, 99) → false
 */
public class In1020 {
	//Class for testing and setting dummy values
	public static void main( String [] args ) {	

		//Output tests
		System.out.println( in1020( 5, 8 ) );
	}
		
	public static boolean in1020( int a, int b ) {
		  if( ( a >= 10 && a <= 20 )|| ( b >= 10 && b <= 20 ) ) {
			  return true;
		  } else {
			  return false;
		  }
	}
}
