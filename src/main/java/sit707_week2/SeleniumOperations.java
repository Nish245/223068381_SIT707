package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;


public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/Users/NISHANT KHAMKAR/Downloads/chromedriver/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		driver.manage().window().fullscreen();
		
		
		
		
		// Find first input field which is firstname
		WebElement firstName = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + firstName);
		// Send first name
		firstName.sendKeys("Nishant");
		
		WebElement lastName = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lastName);
		lastName.sendKeys("Khamkar");
		
		WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phoneNumber);
		phoneNumber.sendKeys("0422737362");
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		email.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + password);
		password.sendKeys("Abcd@123");
		
		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + confirmPassword);
		confirmPassword.sendKeys("Abcd@123");
		
		WebElement button = driver.findElement(By.cssSelector("[data-testid='account-action-btn']"));
		button.click();
		
		// Sleep a while
		sleep(2);
		
		// Take screenshot and store it as a file
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define the path where you want to save the screenshot
        File destinationFile = new File("C:/Users/NISHANT KHAMKAR/eclipse-workspace/task2_1P/output/officeworks.png");
        
        try {
			// Save the screenshot to the desired location
			FileHandler.copy(screenshot, destinationFile);
			System.out.println("Screenshot saved as screenshot.png");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		// close chrome driver
		driver.close();	
	}
	
	
}
