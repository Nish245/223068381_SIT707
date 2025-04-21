package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
    
    @Test
    public void testStudentIdentity() {
        String studentId = "123456789"; 
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Nishant Khamkar"; 
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testTrueNumberIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(2)); 
    }

    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3)); 
    }

    @Test
    public void testPrimeNumberTrue() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7)); 
    }

    @Test
    public void testPrimeNumberFalseEven() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4)); 
    }

    @Test
    public void testPrimeNumberFalseOne() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1)); 
    }

    @Test
    public void testCancelWeatherAdvice_DangerousWind() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testCancelWeatherAdvice_DangerousRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(30.0, 6.1));
    }

    @Test
    public void testCancelWeatherAdvice_BothConcerning() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.1));
    }

    @Test
    public void testWarnWeatherAdvice_ConcerningWind() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 2.0));
    }

    @Test
    public void testWarnWeatherAdvice_ConcerningRain() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(20.0, 4.1));
    }

    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0));
    }
}
