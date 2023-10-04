package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MultiWindowHandle {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		// Locate the element that says "Click Here" and click on it
		WebElement clickHere = driver.findElement(By.linkText("Click Here"));
		clickHere.click();
		// Get the current window handle
		String mainWindow = driver.getWindowHandle();
		// Get all the window handles
		Set<String> allWindows = driver.getWindowHandles();
		// Iterate over the window handles and switch to the new window
		Iterator<String> window = allWindows.iterator();
		while (window.hasNext()) {
			String currentWindow = window.next();
			if (!currentWindow.equals(mainWindow)) {
				driver.switchTo().window(currentWindow);
				Thread.sleep(1000);//static wait
				WebElement emailid = driver.findElement(By.name("emailid"));
				emailid.sendKeys("test@gmail.com");
				WebElement submitButton = driver.findElement(By.name("btnLogin"));
				submitButton.click();
			}
			
		}
	}

	@BeforeTest
	public void beforeTest() {
		// Create an instance of ChromeDriver
		driver = new ChromeDriver();
		// Navigate to the website
		driver.get("https://demo.guru99.com/popup.php");
	}

	@AfterTest
	public void afterTest() {
	}

}
