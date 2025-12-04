package flik;

import org.junit.Test;
import static org.junit.Assert.*;

public class FlikTest {

    @Test
    public void testSmallNumbers() {
        assertTrue("0 should equal 0", Flik.isSameNumber(0, 0));
        assertTrue("1 should equal 1", Flik.isSameNumber(1, 1));
        assertTrue("100 should equal 100", Flik.isSameNumber(100, 100));
    }

    @Test
    public void testLargeNumbers() {
        assertTrue("128 should equal 128", Flik.isSameNumber(128, 128));
        assertTrue("129 should equal 129", Flik.isSameNumber(129, 129));
        assertTrue("500 should equal 500", Flik.isSameNumber(500, 500));
    }

    @Test
    public void testDifferentNumbers() {
        assertFalse("128 != 129", Flik.isSameNumber(128, 129));
        assertFalse("5 != 6", Flik.isSameNumber(5, 6));
    }
}
