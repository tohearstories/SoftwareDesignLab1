package softwaredesignweek1junittesting;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * @author tug25013
 */
public class GeorgeJunit {

    @Test
    public void testPrintMessage() {
        Date date1 = new Date(2006, 3, 26);
        Date date2 = new Date(2006, 3, 1);
        assertEquals(25, date1.daysTo(date2));
    }

    @Test
    public void testPrintMessage1() {
        Date date1 = new Date(2006, 4, 1);
        Date date2 = new Date(2006, 3, 1);
        assertEquals(12, date1.daysTo(date2));
    }

    @Test
    public void testPrintMessage2() {
        Date date1 = new Date(2008, 3, 1);
        Date date2 = new Date(2006, 3, 1);
        assertEquals(102, date1.daysTo(date2));
    }

}
