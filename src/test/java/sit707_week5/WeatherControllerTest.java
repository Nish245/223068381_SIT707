package sit707_week5;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class WeatherControllerTest {

    private static WeatherController wController;
    private static double[] hourlyTemperatures;
    private static int nHours;

    @BeforeClass
    public static void setUpOnce() {
        // Create the controller instance only once
        wController = WeatherController.getInstance();

        // Retrieve all the hours temperatures recorded as for today
        nHours = wController.getTotalHours();
        hourlyTemperatures = new double[nHours];
        for (int i = 0; i < nHours; i++) {
            hourlyTemperatures[i] = wController.getTemperatureForHour(i + 1);
        }
    }

    @AfterClass
    public static void tearDownOnce() {
        // Close the controller only once
        wController.close();
    }

    @Test
    public void testStudentIdentity() {
        String studentId = "223068381";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Nishant Khamkar";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testTemperatureMin() {
        System.out.println("+++ testTemperatureMin +++");

        // Calculate minimum temperature
        double minTemperature = Double.MAX_VALUE;
        for (double temp : hourlyTemperatures) {
            if (minTemperature > temp) {
                minTemperature = temp;
            }
        }

        // Assert the cached minimum matches calculated minimum
        Assert.assertEquals(minTemperature, wController.getTemperatureMinFromCache(), 0.001);
    }

    @Test
    public void testTemperatureMax() {
        System.out.println("+++ testTemperatureMax +++");

        // Calculate maximum temperature
        double maxTemperature = Double.MIN_VALUE;
        for (double temp : hourlyTemperatures) {
            if (maxTemperature < temp) {
                maxTemperature = temp;
            }
        }

        // Assert the cached maximum matches calculated maximum
        Assert.assertEquals(maxTemperature, wController.getTemperatureMaxFromCache(), 0.001);
    }

    @Test
    public void testTemperatureAverage() {
        System.out.println("+++ testTemperatureAverage +++");

        // Calculate average temperature
        double sumTemp = 0;
        for (double temp : hourlyTemperatures) {
            sumTemp += temp;
        }
        double averageTemp = sumTemp / nHours;

        // Assert the cached average matches calculated average
        Assert.assertEquals(averageTemp, wController.getTemperatureAverageFromCache(), 0.001);
    }
}
