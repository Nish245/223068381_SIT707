package sit707_week2;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BunningsLoginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/NISHANT KHAMKAR/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bunnings.com.au/login");

        // Correct explicit wait
        wait = new WebDriverWait(driver, 10); 
    }

    @Test
    public void testInvalidEmailAndPassword() throws InterruptedException {
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-submit"));

        email.sendKeys("wrong@example.com");
        password.sendKeys("WrongPass123");
        loginBtn.click();

        Thread.sleep(2000);
        assertTrue(driver.getCurrentUrl().contains("/login"));
    }

    @Test
    public void testEmptyEmailAndPassword() throws InterruptedException {
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-submit"));

        email.sendKeys("");
        password.sendKeys("");
        loginBtn.click();

        Thread.sleep(2000);
        assertTrue(driver.getCurrentUrl().contains("/login"));
    }

    @Test
    public void testInvalidEmailFormat() throws InterruptedException {
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-submit"));

        email.sendKeys("invalidemail");
        password.sendKeys("SomePass123");
        loginBtn.click();

        Thread.sleep(2000);
        assertTrue(driver.getCurrentUrl().contains("/login"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
