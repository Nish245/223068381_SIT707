package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginServiceTest {

    private void sleep(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private WebDriver startDriverAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/NISHANT KHAMKAR/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/NISHANT KHAMKAR/Downloads/7.1P-resources/pages/login.html"); 
        sleep(2);
        return driver;
    }

    private void fillFormAndSubmit(WebDriver driver, String user, String pass, String dob) {
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("passwd")).sendKeys(pass);
        driver.findElement(By.id("dob")).sendKeys(dob);
        driver.findElement(By.cssSelector("[type=submit]")).submit();
        sleep(2);
    }

    @Test
    public void testLoginSuccess() {
        WebDriver driver = startDriverAndNavigate();
        fillFormAndSubmit(driver, "ahsan", "ahsan_pass", "2000-01-01");
        Assert.assertEquals("success", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testInvalidUsername() {
        WebDriver driver = startDriverAndNavigate();
        fillFormAndSubmit(driver, "wrong", "ahsan_pass", "2000-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testInvalidPassword() {
        WebDriver driver = startDriverAndNavigate();
        fillFormAndSubmit(driver, "ahsan", "wrong_pass", "2000-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testInvalidDob() {
        WebDriver driver = startDriverAndNavigate();
        fillFormAndSubmit(driver, "ahsan", "ahsan_pass", "1990-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }
}
