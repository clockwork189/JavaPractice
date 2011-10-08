
public class sleepIn {
	
	public static void main( String[] args ) {
	
		boolean weekday = true;
		boolean vacation = true;
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
