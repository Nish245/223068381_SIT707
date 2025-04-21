package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopFunctionsTest {

    @Test
    public void testSumFirstN_5() {
        Assert.assertEquals(15, LoopFunctions.sumFirstN(5)); 
    }

    @Test
    public void testSumFirstN_0() {
        Assert.assertEquals(0, LoopFunctions.sumFirstN(0)); 
    }

    @Test
    public void testSumFirstN_1() {
        Assert.assertEquals(1, LoopFunctions.sumFirstN(1)); 
    }

    @Test
    public void testSumFirstN_10() {
        Assert.assertEquals(55, LoopFunctions.sumFirstN(10)); 
    }

    @Test
    public void testSumFirstN_Negative() {
        Assert.assertEquals(0, LoopFunctions.sumFirstN(-1)); 
    }

    @Test
    public void testCountEven_5() {
        Assert.assertEquals(2, LoopFunctions.countEvenNumbers(5)); 
    }

    @Test
    public void testCountEven_0() {
        Assert.assertEquals(0, LoopFunctions.countEvenNumbers(0)); 
    }

    @Test
    public void testCountEven_10() {
        Assert.assertEquals(5, LoopFunctions.countEvenNumbers(10));
    }

    @Test
    public void testCountEven_1() {
        Assert.assertEquals(0, LoopFunctions.countEvenNumbers(1)); 
    }

    @Test
    public void testCountEven_2() {
        Assert.assertEquals(1, LoopFunctions.countEvenNumbers(2)); 
    }

    @Test
    public void testCountEven_Negative() {
        Assert.assertEquals(0, LoopFunctions.countEvenNumbers(-5));
    }
}
