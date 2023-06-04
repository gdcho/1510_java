package q2;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author David
 * @version 2023
 */
public class TimesheetTest {
    
    @Test
    void testNoArgumentConstructor() {
        Timesheet timesheet = new Timesheet();
        assertNull(timesheet.getEmpNum());
        assertNull(timesheet.getEndWeek());
        assertTrue(timesheet.getDetails().isEmpty());
    }

    @Test
    void testConstructorWithEmpNumAndEndWeek() {
        Timesheet timesheet = new Timesheet("E12345", LocalDate.of(2023, 4, 7));
        assertEquals("E12345", timesheet.getEmpNum());
        assertEquals(LocalDate.of(2023, 4, 7), timesheet.getEndWeek());
        assertTrue(timesheet.getDetails().isEmpty());
    }

    @Test
    void testConstructorWithInvalidEndWeek() {
        assertThrows(IllegalArgumentException.class, () ->
            new Timesheet("E12345", LocalDate.of(2023, 4, 6))
        );
    }
}
