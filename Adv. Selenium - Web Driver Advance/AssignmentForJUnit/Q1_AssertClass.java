package AssignmentForJUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Q1_AssertClass {
	@Test
	public void test() {
		int a =1;
		int b =1;
		assertEquals(a, b);
		
		int a1[] = {1,2,3,4,5};
		int b1[] = {1,2,3,4,5};
		assertArrayEquals(a1, b1);
		
		assertTrue(true);
		assertFalse(false);
	}
	@Test
    public void assertNotEqualsCheck() {
        int expected = 15;
        int actual = 5 * 2;
        assertNotEquals("Multiplication shouldn't be 15", expected, actual);
    }

    @Test
    public void isEvenNumber() {
        assertTrue("Number is even", 10 % 2 == 0);
    }

    @Test
    public void isNegativeNumber() {
        assertFalse("Number shouldn't be negative", -7 > 0);
    }

    @Test
    public void shouldBeNull() {
        String str = null;
        assertNull("String should be null", str);
    }

    @Test
    public void shouldNotBeNull() {
        Double value = Math.sqrt(25.0);
        assertNotNull("Sqrt should not return null", value);
    }
}