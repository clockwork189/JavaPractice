// Back to basics. Fibionacci Series. Oh I miss this one! :P
public class Fibionacci {
	public static void main( String[] args ) {
		// Test value
		System.out.println( Fibionacci( 6 ) );
	}
	
	public static int Fibionacci( int n ) {
		if( n == 0 ) {
			return 0;
		} else if( n == 1 ) {
			return 1;
		} else {
			return Fibionacci( n-1 ) + Fibionacci( n -2 );
		}
	}
}
