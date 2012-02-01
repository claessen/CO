interface DateConstants
{
    public static final int DAYS_IN_JAN     = 31;
    public static final int DAYS_IN_MAR     = 31;
    public static final int DAYS_IN_APR     = 30;
    public static final int DAYS_IN_MAY     = 31;
    public static final int DAYS_IN_JUN     = 30;
    public static final int DAYS_IN_JUL     = 31;
    public static final int DAYS_IN_AUG     = 31;
    public static final int DAYS_IN_SEP     = 30;
    public static final int DAYS_IN_OCT     = 31;
    public static final int DAYS_IN_NOV     = 30;
    public static final int DAYS_IN_DEC     = 31;
}

public class Date implements DateConstants {
	public static void main (String argv[]) {
	System.out.println(DAYS_IN_NOV);
	}
	
	
	/* A year is a leap year if it is divisible by 4
	 * Unless it is also divisible by 100
	 * However; years divisible by 400 are leap years
	 */
	boolean isLeapYear(int year) {
		
		// Write this to favor clarity over performance
		
		boolean isLeapYear = false;
		if ((year % 4)==0) isLeapYear = true;
		if ((year % 100)==0) isLeapYear = false;
		if ((year % 400)==0) isLeapYear = true;
		
		return isLeapYear;
		
	}

}
