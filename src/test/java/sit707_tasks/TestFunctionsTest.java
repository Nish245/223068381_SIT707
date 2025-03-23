package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class TestFunctionsTest {

    private TestFunctions functions = new TestFunctions();

    // --- ADD FUNCTION TESTS ---

    @Test
    public void testAddPositiveNumbers() {
        Assert.assertEquals(5, functions.add(2, 3));
    }

    @Test
    public void testAddZeroAndPositive() {
        Assert.assertEquals(4, functions.add(0, 4));
    }

    @Test
    public void testAddZeroAndZero() {
        Assert.assertEquals(0, functions.add(0, 0));
    }

    @Test
    public void testAddNegativeAndPositive() {
        Assert.assertEquals(1, functions.add(-1, 2));
    }

    @Test
    public void testAddLargeNumbers() {
        Assert.assertEquals(2000000000, functions.add(1000000000, 1000000000));
    }

    // --- CONCAT FUNCTION TESTS ---

    @Test
    public void testConcatTwoStrings() {
        Assert.assertEquals("HelloWorld", functions.concat("Hello", "World"));
    }

    @Test
    public void testConcatWithEmptyString() {
        Assert.assertEquals("Hello", functions.concat("Hello", ""));
    }

    @Test
    public void testConcatBothEmpty() {
        Assert.assertEquals("", functions.concat("", ""));
    }

    @Test(expected = NullPointerException.class)
    public void testConcatWithNull() {
        functions.concat(null, "World");
    }

    @Test(expected = NullPointerException.class)
    public void testConcatBothNull() {
        functions.concat(null, null);
    }

}
