import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

	@Test
	public void testIsLeapYear() {
		Date myDate = new Date();
		
		
		assertEquals(myDate.isLeapYear(2012),true);
		
		assertEquals(myDate.isLeapYear(2008),true);
		
		assertEquals(myDate.isLeapYear(2008),true);
		
		assertEquals(myDate.isLeapYear(2400),true);
		assertEquals(myDate.isLeapYear(2800),true);

		assertEquals(myDate.isLeapYear(2011),false);
		
	}

}
