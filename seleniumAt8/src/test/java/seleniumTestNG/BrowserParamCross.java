package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class BrowserParamCross {
	WebDriver driver;

	@Test
	public void f() {

		WebElement usernameField = driver.findElement(By.name("userName"));
		usernameField.sendKeys("tutorial");
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("tutorial");
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
	}

	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");

	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
