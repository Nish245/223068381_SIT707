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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
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

		driver.manage().window().maximize();
		
		// Find first input field which is firstname
		WebElement fName = driver.findElement(By.id("inputFName"));
		fName.sendKeys("Nishant");

		WebElement lName = driver.findElement(By.id("inputLName"));
		lName.sendKeys("Khamkar");

		WebElement email = driver.findElement(By.id("inputEmail"));
		email.sendKeys("likithgtr@gmail.com");

		WebElement password = driver.findElement(By.id("inputPassword"));
		password.sendKeys("Abcd@123");

		WebElement confirmPassword = driver.findElement(By.id("inputConfirmPass"));
		confirmPassword.sendKeys("Abcd@123");
		
		Actions actions = new Actions(driver);
		actions.sendKeys("\uE00F").perform();
		
		sleep(3);

		WebElement TandC = driver.findElement(By.id("AcceptTermsAndConditions"));
		TandC.click();

		if (TandC.isSelected()) {
			System.out.println("Checkbox is Toggled On");

		} else {
			System.out.println("Checkbox is Toggled Off");
		}

		WebElement register = driver.findElement(By.className("btn-primary"));
		register.click();

		sleep(2);

		// Take screenshot and store it as a file
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Define the path where you want to save the screenshot
		File destinationFile = new File("C:/Users/NISHANT KHAMKAR/eclipse-workspace/task2_1P_alternative_website/output/CentreCom.png");
		System.out.println("Screenshot saved as CentreCom.png");

		try {
			// Save the screenshot to the desired location
			FileHandler.copy(screenshot, destinationFile);
			System.out.println("Screenshot saved as screenshot.png");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
